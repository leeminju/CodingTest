p a c k a g e   S t a c k _ a n d _ Q u e u e ;  
  
 i m p o r t   j a v a . u t i l . * ;  
  
 p u b l i c   c l a s s   s t o c k _ p r i c e 2   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 i n t [ ]   p r i c e s   =   {   1 ,   2 ,   3 ,   2 ,   1 ,   3   } ;  
 	 	 S o l u t i o n 6   s o l   =   n e w   S o l u t i o n 6 ( ) ;  
 	 	 s o l . s o l u t i o n ( p r i c e s ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 6 {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( i n t [ ]   p r i c e s )   {  
 	 	 i n t [ ]   a n s w e r   =   n e w   i n t [ p r i c e s . l e n g t h ] ;  
 	 	 i n t   i d x = 0 ;  
 	 	 Q u e u e < I n t e g e r >   q u e u e = n e w   L i n k e d L i s t < > ( ) ;  
 	 	  
 	 	 / /   P�\�  xԔ��� 
 	 	 f o r ( i n t   i = 0 ; i < p r i c e s . l e n g t h ; i + + )  
 	 	 {  
 	 	 	 q u e u e . o f f e r ( p r i c e s [ i ] ) ;  
 	 	 }  
 	 	  
 	 	 w h i l e ( ! q u e u e . i s E m p t y ( ) )  
 	 	 {  
 	 	 	 i n t   t i m e = 0 ;  
 	 	 	 i n t   p r i c e = q u e u e . p e e k ( ) ;  
 	 	 	 q u e u e . p o l l ( ) ;  
 	 	 	  
 	 	 	 i f ( q u e u e . i s E m p t y ( ) )  
 	 	 	 {  
 	 	 	 	 a n s w e r [ i d x ] = t i m e ;  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	  
 	 	 	 I t e r a t o r < I n t e g e r >   i t e r a t o r =   q u e u e . i t e r a t o r ( ) ;  
 	 	 	  
 	 	 	 i n t   c o m p a r e = 0 ;  
 	 	 	  
 	 	 	 w h i l e ( i t e r a t o r . h a s N e x t ( ) )  
 	 	 	 {  
 	 	 	 	 t i m e + + ;  
 	 	 	 	 c o m p a r e = i t e r a t o r . n e x t ( ) ;  
 	 	 	  
 	 	 	 	 i f ( p r i c e   >   c o m p a r e )  
 	 	 	 	 {  
 	 	 	 	 	 b r e a k ;  
 	 	 	 	 }  
 	 	 	 }  
 	  
 	 	 	 a n s w e r [ i d x + + ] = t i m e ;  
 	 	 }  
 	 	  
 	 	  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 