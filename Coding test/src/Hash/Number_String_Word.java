p a c k a g e   H a s h ;  
  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
  
 p u b l i c   c l a s s   N u m b e r _ S t r i n g _ W o r d   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g   s = " o n e 4 s e v e n e i g h t " ;  
 	 	 S o l u t i o n 5   s o l = n e w   S o l u t i o n 5 ( ) ;  
 	 	 s o l . s o l u t i o n ( s ) ;  
 	 }  
 }  
 c l a s s   S o l u t i o n 5   {  
         p u b l i c   i n t   s o l u t i o n ( S t r i n g   s )   {  
                 i n t   a n s w e r   =   0 ;  
                 H a s h M a p < S t r i n g , I n t e g e r >   m a p = n e w   H a s h M a p < > ( ) ;  
                  
                 m a p . p u t ( " z e r o " ,   0 ) ;  
                 m a p . p u t ( " o n e " ,   1 ) ;  
                 m a p . p u t ( " t w o " ,   2 ) ;  
                 m a p . p u t ( " t h r e e " ,   3 ) ;  
                 m a p . p u t ( " f o u r " ,   4 ) ;  
                 m a p . p u t ( " f i v e " ,   5 ) ;  
                 m a p . p u t ( " s i x " ,   6 ) ;  
                 m a p . p u t ( " s e v e n " ,   7 ) ;  
                 m a p . p u t ( " e i g h t " ,   8 ) ;  
                 m a p . p u t ( " n i n e " ,   9 ) ;  
                  
         	 f o r ( S t r i n g   k e y : m a p . k e y S e t ( ) )  
         	 {  
         	 	 s = s . r e p l a c e A l l ( k e y , m a p . g e t ( k e y ) . t o S t r i n g ( ) ) ;  
         	 }  
         	  
         	 a n s w e r = I n t e g e r . p a r s e I n t ( s ) ;  
                  
                 r e t u r n   a n s w e r ;  
         }  
 } 