p a c k a g e   H a s h ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . H a s h S e t ;  
  
 p u b l i c   c l a s s   R e p o r t 2   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g [ ]   i d _ l i s t   =   {   " m u z i " ,   " f r o d o " ,   " a p e a c h " ,   " n e o "   } ;  
 	 	 S t r i n g [ ]   r e p o r t   =   { " m u z i   f r o d o " , " a p e a c h   f r o d o " , " f r o d o   n e o " , " m u z i   n e o " , " a p e a c h   m u z i "   } ;  
 	 	 i n t   k   =   2 ;  
 	 	 S o l u t i o n 3   s   =   n e w   S o l u t i o n 3 ( ) ;  
 	 	 s . s o l u t i o n ( i d _ l i s t ,   r e p o r t ,   k ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 3   {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( S t r i n g [ ]   i d _ l i s t ,   S t r i n g [ ]   r e p o r t ,   i n t   k )   {  
  
 	 	 i n t   N   =   i d _ l i s t . l e n g t h ;  
 	 	 i n t [ ]   a n s w e r   =   n e w   i n t [ N ] ;   / /   I D ȹ�  ���\�  D�t�� �  �����\�  ���   ȥ�\�  0���( D�t���<�\�   ȥ�)  
 	 	 A r r a y L i s t < U s e r >   u s e r s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	 A r r a y L i s t < S t r i n g >   s u s p e n d e d L i s t   =   n e w   A r r a y L i s t < > ( ) ; / /   ��ɬ��¸� 
 	 	 H a s h M a p < S t r i n g ,   I n t e g e r >   i d I d x   =   n e w   H a s h M a p < S t r i n g ,   I n t e g e r > ( ) ;  
 	 	 i n t   i d x   =   0 ;  
 	 	  
 	 	 f o r   ( S t r i n g   n a m e   :   i d _ l i s t )   {  
  
 	 	 	 i d I d x . p u t ( n a m e ,   i d x + + ) ;  
 	 	 	 u s e r s . a d d ( n e w   U s e r ( n a m e ) ) ;  
 	 	 	  
 	 	 }  
  
 	 	  
 	 	 f o r   ( S t r i n g   s t r   :   r e p o r t )   {  
 	 	 	 S t r i n g [ ]   s t   =   s t r . s p l i t ( "   " ) ;  
  
 	 	 	 u s e r s . g e t ( i d I d x . g e t ( s t [ 0 ] ) ) . r e p o r t L i s t . a d d ( s t [ 1 ] ) ;  
 	 	 	 u s e r s . g e t ( i d I d x . g e t ( s t [ 1 ] ) ) . r e p o r t e d L i s t . a d d ( s t [ 0 ] ) ;  
 	 	 }  
  
 	 	 f o r   ( U s e r   u s e r   :   u s e r s )   {  
 	 	 	 i f   ( u s e r . r e p o r t e d L i s t . s i z e ( )   > =   k )   {  
 	 	 	 	 s u s p e n d e d L i s t . a d d ( u s e r . n a m e ) ;  
 	 	 	 }  
 	 	 }  
  
 	 	 f o r   ( U s e r   u s e r   :   u s e r s )   {  
 	 	 	 f o r   ( S t r i n g   r e p o r t i d   :   u s e r . r e p o r t L i s t )   {  
 	 	 	 	 i f   ( s u s p e n d e d L i s t . c o n t a i n s ( r e p o r t i d ) )   {  
 	 	 	 	 	 a n s w e r [ i d I d x . g e t ( u s e r . n a m e ) ] + + ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
  
 c l a s s   U s e r   {  
 	 S t r i n g   n a m e ;  
 	 H a s h S e t < S t r i n g >   r e p o r t L i s t ; / /   ��\�  ���¸� 
 	 H a s h S e t < S t r i n g >   r e p o r t e d L i s t ; / /   ���  �@�  ���¸� 
  
 	 p u b l i c   U s e r ( S t r i n g   n a m e )   {  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 	 r e p o r t L i s t   =   n e w   H a s h S e t < > ( ) ;  
 	 	 r e p o r t e d L i s t   =   n e w   H a s h S e t < > ( ) ;  
 	 }  
 } 