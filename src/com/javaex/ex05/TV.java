package com.javaex.ex05;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel,int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public void power(boolean power) {
		if(power==true) {
			this.power=true;
		}else if(power==false) {
			this.power=false;}
	}
	public void channel(int channel) {
		if(channel<1)
			this.channel=1;
		else if(channel>255)
			this.channel=255;
	}
	public void channel (boolean up) {
		if(up==true)
			channel=channel+1;
		else
			channel=channel-1;
		
	}
	public void volume(int volume) {
		if(volume<0) {
			this.volume=0;
		}else if(volume>100) {
			this.volume=100;
		}
	}
	public void volume(boolean up) {
		if((up==true)&&volume!=100)
			volume=volume+1;
		else if((up==false)&&volume!=0)
			volume=volume-1;
		
	}
	
	public void status() {
		System.out.print(channel+"번  "+volume+":음량  ");
		if(power==true)
			System.out.println("TV가 켜졌습니다.");
		else
			System.out.println("TV가 꺼졌습니다.");
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolumel() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}

}
