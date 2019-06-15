package model;

public class Ratings {
	int userId;
	int movieId;
	float rating;
	long timeStamp;
	
	public Ratings(int userId, int movieId, float rating, long timeStamp) {
		this.movieId = movieId;
		this.rating = rating;
		this.userId = userId;
		this.timeStamp = timeStamp;
	}
	
	public Ratings(int userId) {
		this.userId = userId;
		}
	
	public Ratings(){
		
	}
	
	public int getMovieId() {
		return movieId;
	}
	
	public float getRating() {
		return rating;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
