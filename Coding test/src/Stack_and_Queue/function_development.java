p a c k a g e   S t a c k _ a n d _ Q u e u e ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i n k e d L i s t ;  
 i m p o r t   j a v a . u t i l . Q u e u e ;  
  
 p u b l i c   c l a s s   f u n c t i o n _ d e v e l o p m e n t   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 i n t [ ]   p r o g r e s s e s   =   { 9 5 ,   9 0 ,   9 9 ,   9 9 ,   8 0 ,   9 9 } ;   / /   ��ĳ  ( 0����) ( 1 0 0 ��̹)  
 	 	 i n t [ ]   s p e e d s   =   {   1 ,   1 ,   1 ,   1 ,   1 ,   1   } ; / /   ��  ��ĳ( 1 0 0 t�X�)  
 	 	 S o l u t i o n 2   s o l   =   n e w   S o l u t i o n 2 ( ) ;  
 	 	 s o l . s o l u t i o n ( p r o g r e s s e s ,   s p e e d s ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 2   {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( i n t [ ]   p r o g r e s s e s ,   i n t [ ]   s p e e d s )   {  
 	 	 i n t [ ]   a n s w e r ; / /   �  0���ȹ�  ��  �X�  0���t�  0�������� 
 	 	 A r r a y L i s t < I n t e g e r >   a n s w e r l i s t = n e w   A r r a y L i s t < I n t e g e r > ( ) ;  
 	 	 Q u e u e < I n t e g e r >   q u e u e   =   n e w   L i n k e d L i s t < I n t e g e r > ( ) ;  
 	 	 i n t   c o u n t = 1 ;  
 	 	 / /   0��Ӕ�  X����  \�  ��̹  `�  �  ��<�p�,   X��X�  ]���  t�踴�����   �� 
 	 	 / /   ����  �ǔ�  0���@�  ^���  �ǔ�  0���t�  0��� �  L�  h�خ  0��� 
  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   p r o g r e s s e s . l e n g t h ;   i + + )   {  
 	 	 	 i n t   d a y   =   0 ;  
 	 	 	 w h i l e   ( p r o g r e s s e s [ i ]   <   1 0 0 )   {  
 	 	 	 	 d a y + + ;  
 	 	 	 	 p r o g r e s s e s [ i ]   + =   s p e e d s [ i ] ;  
 	 	 	 }  
 	 	 	 q u e u e . o f f e r ( d a y ) ;  
 	 	 }  
 	  
 	 	 i n t   m a x = q u e u e . p e e k ( ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( q u e u e . p o l l ( ) ) ;  
 	 	  
 	 	 w h i l e ( q u e u e . s i z e ( ) > 0 )  
 	 	 {  
 	 	 	 i f ( m a x   > =   q u e u e . p e e k ( ) )  
 	 	 	 {  
 	 	 	 	 c o u n t + + ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( q u e u e . p o l l ( ) ) ;  
 	 	 	 } e l s e   {  
 	 	 	 	 a n s w e r l i s t . a d d ( c o u n t ) ;  
 	 	 	 	  
 	 	 	 	 c o u n t = 1 ;  
 	 	 	 	 m a x = q u e u e . p e e k ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( q u e u e . p o l l ( ) ) ;  
 	 	 	 }  
 	 	 }  
 	 	 a n s w e r l i s t . a d d ( c o u n t ) ;  
 	 	 a n s w e r   =   n e w   i n t [ a n s w e r l i s t . s i z e ( ) ] ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < a n s w e r . l e n g t h ; i + + )  
 	 	 {  
 	 	 	 a n s w e r [ i ] = a n s w e r l i s t . g e t ( i ) ;  
 	 	 }  
 	 	  
 	 	  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
 