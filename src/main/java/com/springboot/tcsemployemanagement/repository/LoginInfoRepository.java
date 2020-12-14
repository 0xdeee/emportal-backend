package com.springboot.tcsemployemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tcsemployemanagement.model.LoginInfo;

public interface LoginInfoRepository extends JpaRepository<LoginInfo, String> {


}
