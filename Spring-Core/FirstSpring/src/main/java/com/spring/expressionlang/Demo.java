package com.spring.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{5>1}")
	private boolean isActive;
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Value("#{5>4 ? 100 : -100}")
	private int x;
	@Value("98")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double sqrt;
	public double getSqrt() {
		return sqrt;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	@Value("#{ T(java.lang.Math).E}")
	private double e;
	public int getX() {
		return x;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
		public void setY(int y) {
		this.y = y;
	}
		@Override
		public String toString() {
			return "Demo [isActive=" + isActive + ", x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", pi=" + pi + ", e=" + e
					+ "]";
		}
	

//	@Override
//	public String toString() {
//		return "Demo [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//	
}
