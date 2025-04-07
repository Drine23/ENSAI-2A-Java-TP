
package fr.ensai.running.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ensai.running.model.Competition;
import fr.ensai.running.repository.CompetitionRepository;

@Service
public class CompetitionService {

    private static final Logger log = LoggerFactory.getLogger(CompetitionService.class);

    @Autowired
    private CompetitionRepository competitionRepository;

    /**
     * Find an competition by id
     * 
     * @return competition or null if not found
     */
    public Competition findById(Long id) {
        return competitionRepository.findById(id).orElse(null);
    }

    public List<Competition> findAll() {
        return competitionRepository.findAll();
    }

    /**
     * Create or Update an Athlete
     */
    public Competition save(Competition competition) {
        return competitionRepository.save(competition);
    }

    public void deleteById(Long id) {
        competitionRepository.deleteById(id);
        log.warn("Competition {} deleted", id);
    }
}