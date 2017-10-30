package com.iana.sdata.repository;

import com.iana.sdata.domain.Language;
import com.iana.sdata.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface LanguageRepository extends JpaRepository<Language, Long>{

    public List<Language> findLanguageByLanguageName(@Param("name") String name);
}
