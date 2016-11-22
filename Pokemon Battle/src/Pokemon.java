public class Pokemon
	{
		String name;
		int hP;
		int attack;
		int defence;
		String type;
		
		public Pokemon(String n, int h,int a, int d, String t)
			{
				name = n;
				hP = h; 
				attack = a;
				defence = d;
				type = t;
						
			}
		
		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public String getName()
			{
				return name;
			}
		public void setName(String n)
			{
				name = n;
			}
		public int getHP()
			{
				return hP;
			}
		public void setHP(int h)
			{
				hP = h;
			}
	
		public int getDefence()
			{
				return defence;
			}
		public void setDefence(int d)
			{
				defence = d;
			}
		public String getType()
			{
				return type;
			}
		public void setType(String t)
			{
				type = t;
			}
		
		
		
	}
