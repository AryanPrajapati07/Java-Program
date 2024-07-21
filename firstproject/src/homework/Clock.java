package homework;

public class Clock {
	
//	Question 2

	private int hour;
	private int min;
	private int sec;

	public Clock(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public Clock() {
		this.hour = 12;
		this.min = 0;
		this.sec = 0;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Clock [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

	public Clock(int totalsec) {
		setClock(totalsec);
	}

	public void setClock(int totalsec) {
		hour = (totalsec / 3600) % 24;
		min = (totalsec % 3600) / 60;
		sec = totalsec / 60;
	}

	public void tick() {
		setClock((hour*3600 + min*60 + sec+1)%86400);
	}
	
	public void tickDown() {
		setClock((hour*3600 + min*60 + sec-1 + 86400)%86400);
	}
	
	 public void addClock(Clock otherclock) {
	        int sec1 = this.hour * 3600 + this.min * 60 + this.sec +
	                           otherclock.hour * 3600 + otherclock.min * 60 + otherclock.sec;
	        setClock(sec1 % 86400);
	    }
	
	public Clock subtractClock(Clock otherclock) {
		int sec1 = this.hour*3600 + this.min*60 + this.sec;
		int sec2 = otherclock.hour*3600 + otherclock.min * 60 + otherclock.sec;
		int sec3 = (sec1 - sec2 + 86400)%86400;
		return otherclock;
	}

//	private int Clock(int sec3) {
//		// TODO Auto-generated method stub
//		return sec3;
//	}
	


	

}
