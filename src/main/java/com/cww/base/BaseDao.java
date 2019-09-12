package com.cww.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


/*
 * 相当于你在使用spring data jpa 的时候，每个实体类有需要实现的相同的方法，就可以单独抽取出来，放在一个公共的接口中，
 * 并这个类继承了jpa的相关Repository接口或类，由这个接口来衔接jpa的相关操作，其他实体类需要实现的操作就直接继承BaseDao接口，
 * 不用每次都去继承jpa的相关接口或类啦，所以这个公共接口就需要这个注解@NoRepositoryBean来标识
 * 
 * 如果您正在使用Spring命名空间使用Spring命名空间进行自动存储库接口检测，那将导致Spring尝试创建MyRepository实例
 * 如果spring创建实例会报错。此注解可以使spring避免对此类的实例化
 */
@NoRepositoryBean
public interface BaseDao<T> extends JpaRepository<T,Long>{
	
	Page<T> findAll(Specification<T> specification, Pageable pageable);
	
}
