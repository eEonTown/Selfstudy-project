package com.yh.tictactoe.controller;

public class Board {
	
		private String f1;
		private String f2;
		private String f3;
		private String f4;
		private String f5;
		private String f6;
		private String f7;
		private String f8;
		private String f9;
		
		public Board(String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8,
				String f9) {
			super();
			this.f1 = f1;
			this.f2 = f2;
			this.f3 = f3;
			this.f4 = f4;
			this.f5 = f5;
			this.f6 = f6;
			this.f7 = f7;
			this.f8 = f8;
			this.f9 = f9;
		}

		public String getF1() {
			return f1;
		}

		public void setF1(String f1) {
			this.f1 = f1;
		}

		public String getF2() {
			return f2;
		}

		public void setF2(String f2) {
			this.f2 = f2;
		}

		public String getF3() {
			return f3;
		}

		public void setF3(String f3) {
			this.f3 = f3;
		}

		public String getF4() {
			return f4;
		}

		public void setF4(String f4) {
			this.f4 = f4;
		}

		public String getF5() {
			return f5;
		}

		public void setF5(String f5) {
			this.f5 = f5;
		}

		public String getF6() {
			return f6;
		}

		public void setF6(String f6) {
			this.f6 = f6;
		}

		public String getF7() {
			return f7;
		}

		public void setF7(String f7) {
			this.f7 = f7;
		}

		public String getF8() {
			return f8;
		}

		public void setF8(String f8) {
			this.f8 = f8;
		}

		public String getF9() {
			return f9;
		}

		public void setF9(String f9) {
			this.f9 = f9;
		}

		@Override
		public String toString() {
			return "\n" + f1 + " " + f2 + " " + f3 + "\n" +
				   f4 + " " + f5 + " " + f6 + "\n" +
				   f7 + " " + f8 + " " + f9 + "\n";
		}
		
		
		
		
		
		
}
