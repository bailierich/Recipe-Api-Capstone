package co.grandcircus.apicapstone.model;

import java.util.List;

public class Outermost {
	
	private String q;
	private Integer to;
	private Integer from;
	private Boolean more;
	private Integer count;
	private List<Result> hits;
	
	public Outermost() {
		
	}
	
	public Outermost(String q, Integer to, Integer from, Boolean more, Integer count, List<Result> hits) {
		super();
		this.q = q;
		this.to = to;
		this.from = from;
		this.more = more;
		this.count = count;
		this.hits = hits;
	}
	
	public String getQ() {
		return q;
	}
	
	public void setQ(String q) {
		this.q = q;
	}
	
	public Integer getTo() {
		return to;
	}
	
	public void setTo(Integer to) {
		this.to = to;
	}
	
	public Integer getFrom() {
		return from;
	}
	
	public void setFrom(Integer from) {
		this.from = from;
	}
	
	public Boolean getMore() {
		return more;
	}
	
	public void setMore(Boolean more) {
		this.more = more;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public List<Result> getHits() {
		return hits;
	}
	
	public void setHits(List<Result> hits) {
		this.hits = hits;
	}
	
	@Override
	public String toString() {
		return "Outermost [q=" + q + ", to=" + to + ", from=" + from + ", more=" + more + ", count=" + count + ", hits="
				+ hits + "]";
	}
}
