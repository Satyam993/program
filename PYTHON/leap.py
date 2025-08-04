y=int(input("enter the year ="))
if ( (y%4==0 and y%100!=0) or (y%400==0)):
	print(f" given year {y} is leap year")
else:
	print(f"given number {y} is not leap year")