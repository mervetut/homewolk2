package com.company;

public class Main {

    public static void main(String[] args) {
	int y = -7, x = 5, m = 0, result = 0;
	if (y < 0)
    {
        y = -y;
        m = -1;
    }
	else
	    m = 1;

	while (y > 0) {
	    if (y % 2 == 0)
        {
            x = x + x;
            y = y / 2;
        }
	    else
        {
            result = result + x;
            y = y - 1;
        }
    }

	if (m < 0)
	    result = -result;
        System.out.println(result);
    }
}
