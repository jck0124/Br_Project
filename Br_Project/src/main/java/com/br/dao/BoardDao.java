package com.br.dao;

import java.util.ArrayList;

import com.br.dto.PlazaBoardDto;
import com.br.dto.PlazaDetailDto;
import com.br.dto.RecipeDto;
import com.br.dto.RecipeImgDto;
import com.br.dto.SelectEventDto;

public interface BoardDao {
	
	// 찬균
	
	// 배라광장 게시글 리스트 최신순
	ArrayList<PlazaBoardDto> selectPlazaBoardListOrderByLatest();
	
	// 배라광장 게시글 리스트 추천순 
	ArrayList<PlazaBoardDto> selectPlazaBoardListOrderByLikes();
	
	// 배라광장 게시글 작성
	void insertPlaza(String title, String content, String id, String name, char showName);
	
	// 배라광장 게시글 추천
	void updatePlazaLikes(int boardIdx);
	
	PlazaDetailDto selectPlazaDtoByBoardIdx(int boardIdx);
	
	// 수연
	
	//모든 레시피 목록
	ArrayList<RecipeDto> selectRecipeList();	
	
	// 등록될 레시피idx
	int selectRecipeIdx();	
	
	// 레시피 insert
	void insertRecipe(int insertRecipeIdx, int categoryIdx, String imgUrl, String titleKor, String titleEng);
	
	// 레시피 이미지 
	RecipeImgDto selectRecipeImg(int recipeIdx);
	
	// 수빈
	
	// 이벤트 목록 
	ArrayList<SelectEventDto> selectEvent(int pageNum);
	
	// 이벤트 lastPage
	int getLastPageNumber();
	
	// 이벤트 insert
	void insertEvent(String img, String topLetter, String title, String period);
}
