package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Account_group_v3;




public interface GroupServiceRepo extends CrudRepository<Account_group_v3,Integer>{

	
String ss1="select * from account_group_v3 where company_name=?1 OR visibility='All'  order by group_id DESC";
	
	@Query(nativeQuery =true, value=ss1)
	List<Account_group_v3> selectData(String CompanyName,String CustId);
	
	
String ss2="select * from account_group_v3 where company_name=?1 order by ac_title";
	

	@Query(nativeQuery =true, value=ss2)
	List<Account_group_v3> ac_titleA(String CompanyName,String CustId);
	
	
String ss3="select * from account_group_v3 where company_name=?1 order by ac_title DESC";
	

	@Query(nativeQuery =true, value=ss3)
	List<Account_group_v3> ac_titleD(String CompanyName,String CustId);
	
	
String ss4="select * from account_group_v3 where company_name=?1 order by group_name";
	

	@Query(nativeQuery =true, value=ss4)
	List<Account_group_v3> group_nameA(String CompanyName,String CustId);
	
	
String ss5="select * from account_group_v3 where company_name=?1 order by group_name DESC";
	

	@Query(nativeQuery =true, value=ss5)
	List<Account_group_v3> group_nameD(String CompanyName,String CustId);
	
	
String ss6="select * from account_group_v3 where company_name=?1 order by ac_type";
	

	@Query(nativeQuery =true, value=ss6)
	List<Account_group_v3> ac_typeA(String CompanyName,String CustId);
	
	
	
String ss7="select * from account_group_v3 where company_name=?1 order by ac_type DESC";
	

	@Query(nativeQuery =true, value=ss7)
	List<Account_group_v3> ac_typeD(String CompanyName,String CustId);
	
	
	
String ss8="select * from account_group_v3 where group_id = ?1 ";
	

	@Query(nativeQuery =true, value=ss8)
	List<Account_group_v3> grp_id_Search(String grpId);
	
	
String ss9="select * from account_group_v3 where (group_name = ?1 and company_name=?2) OR ?1 IN ('Bank', 'Customer', 'Service', 'Cash in Hand', 'Tax Credit', 'Duties & Taxes')";
	

	@Query(nativeQuery =true, value=ss9)
	List<Account_group_v3> grp_name_searchs(String grpName,String CompanyName,String CustId);
	
	
String ss10="select group_name from account_group_v3 where group_id = ?1 ";
	

	@Query(nativeQuery =true, value=ss10)
	String selectGroup(String grpName);
	
}
