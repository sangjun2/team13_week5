package com.your.team13.week5;

public class Plan {
	protected double additionalLineRate; // 추가 회선에 따른 요금
	protected double basicMonthlyRate; // 기본 요금
	protected int includedMinutes; // 기본 제공 시간
	protected double ratePerExcessMinutes; // 초과 시간당 요금
	protected String planName;
	
	public Plan() {
		super();
	}

	public double getbasicMonthlyRate() {
		return basicMonthlyRate;
	}

	public int getincludedMinutes() {
		return includedMinutes;
	}

	public double getratePerExcessMinutes() {
		return ratePerExcessMinutes;
	}

	public double getadditionalLineRate() {
		return additionalLineRate;
	}
	
	public String getPlanName() {
		return planName;
	}
}
