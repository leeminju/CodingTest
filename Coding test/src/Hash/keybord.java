p a c k a g e   H a s h ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
  
 p u b l i c   c l a s s   k e y b o r d   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g [ ]   k e y m a p   =   {   " A B A C D " ,   " B C E F D "   } ;  
 	 	 S t r i n g [ ]   t a r g e t s   =   {   " A B C D " ,   " A A B B "   } ;  
  
 	 	 S o l u t i o n 6   s o l   =   n e w   S o l u t i o n 6 ( ) ;  
 	 	 s o l . s o l u t i o n ( k e y m a p ,   t a r g e t s ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 6   {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( S t r i n g [ ]   k e y m a p ,   S t r i n g [ ]   t a r g e t s )   {  
 	 	 i n t [ ]   a n s w e r   =   n e w   i n t [ t a r g e t s . l e n g t h ] ;  
 	 	 i n t   i d x = 0 ;  
 	 	 H a s h M a p < C h a r a c t e r ,   I n t e g e r >   m o v e m a p   =   n e w   H a s h M a p < > ( ) ;  
 	 	  
  
 	 	 f o r   ( S t r i n g   k e y   :   k e y m a p )   {  
  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   k e y . l e n g t h ( ) ;   i + + )   {  
  
 	 	 	 	 c h a r   s i g n   =   k e y . c h a r A t ( i ) ; / /   A  
  
 	 	 	 	 i n t   s t e p   =   m o v e m a p . g e t O r D e f a u l t ( s i g n ,   i   +   1 ) ;   / /   >̔?  ??( ??????1 )  ?  tȬ?\???t?  >̔?  ??X?  ?D?  ?X?X???  ????t?  0???  ?( ??????2 ) D?  ?X?XՔ? 
 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 / /   T??ܴ 
  
 	 	 	 	 m o v e m a p . p u t ( s i g n ,   M a t h . m i n ( s t e p ,   i   +   1 ) ) ; / /  
 	 	 	 }  
 	 	 }  
  
 	 	 f o r   ( S t r i n g   t a r g e t   :   t a r g e t s )   {  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   t a r g e t . l e n g t h ( ) ;   i + + )   {  
 	 	 	 	 i f   ( ! m o v e m a p . c o n t a i n s K e y ( t a r g e t . c h a r A t ( i ) ) )   {  
 	 	 	 	 	 a n s w e r [ i d x ] = - 1 ;  
 	 	 	 	 	 b r e a k ;  
 	 	 	 	 } e l s e   {  
 	 	 	 	 	 a n s w e r [ i d x ]   + =   m o v e m a p . g e t ( t a r g e t . c h a r A t ( i ) ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 i d x + + ;  
 	 	 }  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < a n s w e r . l e n g t h ; i + + )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r [ i ] ) ;  
 	 	 }  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 