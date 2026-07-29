package be_study_8.quiz.quiz53;

import java.util.List;

public class Body {
	
	int totalCount;
	List<Item> items; 
	int pageNo;
	int numOfRows;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	@Override
	public String toString() {
		return "Body [totalCount=" + totalCount + ", items=" + items + ", pageNo=" + pageNo + ", numOfRows=" + numOfRows
				+ "]";
	}
	
}
