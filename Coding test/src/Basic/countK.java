p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   c o u n t K   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )  
 	 {  
 	 	 S o l u t i o n 5   s o l = n e w   S o l u t i o n 5 ( ) ;  
 	 	 s o l . s o l u t i o n ( 1 ,   1 3 ,   1 ) ;  
 	 }  
 }  
 c l a s s   S o l u t i o n 5   {  
         p u b l i c   i n t   s o l u t i o n ( i n t   i ,   i n t   j ,   i n t   k )   {  
                 i n t   a n s w e r   =   0 ;  
                  
                 f o r ( i n t   n u m = i ; n u m < = j ; n u m + + )  
                 {  
                         S t r i n g   n u m b e r = I n t e g e r . t o S t r i n g ( n u m ) ;  
                          
                         f o r ( i n t   i d x = 0 ; i d x < n u m b e r . l e n g t h ( ) ; i d x + + )  
                         {  
                                 i f ( n u m b e r . c h a r A t ( i d x ) = = ( c h a r ) ( k + ' 0 ' ) )  
                                         a n s w e r + + ;  
                         }  
                 }  
                  
                 r e t u r n   a n s w e r ;  
         }  
 }  
 