package co.jw.sol.beans;

public class Page {
	private int min; // 최소페이지
	private int max; // 최대페이지
	private int prevPage;// 이전 버튼 누르면 이동할 페이지 번호
	private int nextPage;// 다음페이지
	private int pagecnt; // 전체 페이지 개수
	private int currentPage;// 현재 페이지 번호
				//전체글 개수		  //현재 글번호	   //페이지당 글개수		 //10
	public Page(int contentCount, int currentPage, int contentPageCount, int pa) {
		this.currentPage=currentPage;
		
		pagecnt=contentCount/contentPageCount;
		//전체게시글 / 10(한 페이지당 보여줄 수 있는 게시글 개수)
		//	525   / 10=52.5 -> 하나 증가해야함 -> 53페이지
		if(contentCount % contentPageCount >0) {	//나누어 떨어지지 않으면
			pagecnt++;
		}
		//1~10 : 1,10		0~9일떄는 1페이지에서 시작
		//11~20 : 11,20	 	10~19일때는 11페이지에서 시작
		//21~30 : 21,30 	20~29일때는 21페이지에서 시작
		
		min=((currentPage-1)/contentPageCount)*contentPageCount+1;	//->0+1
		max=min+pa-1;	//1+10-1->10
		
		if(max>pagecnt) {
			max=pagecnt;
		}
		prevPage=min-1;
		nextPage=max+1;
		
		if(nextPage>pagecnt) {
			nextPage=pagecnt;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPagecnt() {
		return pagecnt;
	}

	public void setPagecnt(int pagecnt) {
		this.pagecnt = pagecnt;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
}
