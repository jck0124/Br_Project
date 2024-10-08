package com.br.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.br.dto.*;

@Repository
public class StoreDaoImpl implements StoreDao {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public ArrayList<StoreDto> selectStoreList() {
		
		List<StoreDto> storeListTemp = sqlSession.selectList("StoreMapper.getAllStore");
		ArrayList<StoreDto> storeList = new ArrayList<StoreDto>();
		storeList.addAll(storeListTemp);
		
		return storeList;
	}
	
	// 수빈
	@Override
	public ArrayList<SelectStoreDto> selectStore() {
		List<SelectStoreDto> storeTemp = sqlSession.selectList("StoreMapper.selectStores");
		ArrayList<SelectStoreDto> store = new ArrayList<SelectStoreDto>();
		store.addAll(storeTemp);
		return store;
	}
	
	@Override
	public ArrayList<DrinkDto> selectDrinksList() {
		List<DrinkDto> drinksList = sqlSession.selectList("StoreMapper.selectAllDrinks");
		return new ArrayList<DrinkDto>(drinksList);
	}
	
	@Override
	public ArrayList<IcecreamDto> selectIcecreamList() {
		
		List<IcecreamDto> icecreamListTemp = sqlSession.selectList("StoreMapper.getAllIcecream");
		ArrayList<IcecreamDto> icecreamList = new ArrayList<IcecreamDto>();
		icecreamList.addAll(icecreamListTemp);
		
		return icecreamList;
	}
	
	@Override
	public ArrayList<ShowIceCreamCakeDto> showIceCreamCake() {
		
		List<ShowIceCreamCakeDto> cakesListTemp = sqlSession.selectList("StoreMapper.selectAllCakes");
		ArrayList<ShowIceCreamCakeDto> cakesList = new ArrayList<ShowIceCreamCakeDto>();
		cakesList.addAll(cakesListTemp);
		return cakesList;
	}
}
