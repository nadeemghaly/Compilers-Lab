/**
 * Write your info here
 *
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */

grammar Task9;

@members {
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}

s returns [int check]: a c b {$check= equals($a.n,$b.n) * equals($a.n,$c.n);};

a returns [int n]: 'a' a {$n = $a.n + 1;}
                |  {$n = 0;};

b returns [int n]: 'b' b {$n = $b.n + 1;}
                |  {$n = 0;};

c returns [int n]: 'c' c {$n = $c.n + 1;}
                |  {$n = 0;};

