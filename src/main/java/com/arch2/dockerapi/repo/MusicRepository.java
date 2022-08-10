package com.arch2.dockerapi.repo;

import com.arch2.dockerapi.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<MusicEntity, Long> {
}
