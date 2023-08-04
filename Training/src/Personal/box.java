package Personal;
 class box 
    {
        int width;
        int height;
        int length;
        int volume;
        @Override
		protected
		void finalize() 
        {
            volume = width*height*length;
            System.out.println(volume);
        }
        protected void volume() 
       {
            volume = width*height*length;
            System.out.println(volume);
       } 
    }    
    class Output 
    { 
        public static void main(String args[])
        {
            box obj = new box();
            obj.width=5;
            obj.height=5;
            obj.length=6;
            obj.volume();
        } 
    }