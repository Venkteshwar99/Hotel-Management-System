package com.Manager.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {
	
	
		@Id
		private long roomId;
		private String roomType;
		private Double roomRent; 
		private int roomNumber; 
		private boolean isAvailable;
		private String roomDescription;
		public long getRoomId() {
			return roomId;
		}
		public Room(long roomId, String roomType, Double roomRent, int roomNumber, boolean isAvailable,
				String roomDescription) {
			super();
			this.roomId = roomId;
			this.roomType = roomType;
			this.roomRent = roomRent;
			this.roomNumber = roomNumber;
			this.isAvailable = isAvailable;
			this.roomDescription = roomDescription;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		public void setRoomId(long roomId) {
			this.roomId = roomId;
		}
		public String getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
		public Double getRoomRent() {
			return roomRent;
		}
		public void setRoomRent(Double roomRent) {
			this.roomRent = roomRent;
		}
		public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public String getRoomDescription() {
			return roomDescription;
		}
		public void setRoomDescription(String roomDescription) {
			this.roomDescription = roomDescription;
		}
		public Room() {
			super();
		
		}
		
}
