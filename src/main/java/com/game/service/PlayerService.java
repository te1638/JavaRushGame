package com.game.service;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface PlayerService {




    List<Player> getPlayersList(Specification<Player> specification);

    Page<Player> getPlayersList(Specification<Player> specification, Pageable sortedByName);

    Player createPlayer(Player playerRequired);

    Player getById(Long id);

    Player updateById(Long id, Player playerRequired);

    boolean deleteById(Long id);

    Specification<Player> nameFilter(String name);

    Specification<Player> titleFilter(String title);

    Specification<Player> raceFilter(Race race);

    Specification<Player> professionFilter(Profession profession);

    Specification<Player> experienceFilter(Integer min, Integer max);

    Specification<Player> levelFilter(Integer min, Integer max);

    Specification<Player> birthdayFilter(Long after, Long before);

    Specification<Player> bannedFilter(Boolean isBanned);

}
