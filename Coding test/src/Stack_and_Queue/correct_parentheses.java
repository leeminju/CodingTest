p a c k a g e   S t a c k _ a n d _ Q u e u e ;  
  
 i m p o r t   j a v a . u t i l . L i n k e d L i s t ;  
 i m p o r t   j a v a . u t i l . Q u e u e ;  
  
 p u b l i c   c l a s s   c o r r e c t _ p a r e n t h e s e s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g   s   =   " ( ( ) ( " ;  
 	 	 S o l u t i o n 3   s o l   =   n e w   S o l u t i o n 3 ( ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( s o l . s o l u t i o n ( s ) ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 3   {  
 	 b o o l e a n   s o l u t i o n ( S t r i n g   s )   {  
 	 	 Q u e u e < C h a r a c t e r >   q u e u e   =   n e w   L i n k e d L i s t < > ( ) ;  
 	  
  
 	 	 f o r   ( c h a r   c :   s . t o C h a r A r r a y ( ) )  
 	 	 {  
 	 	 	 i f ( c = = ' ( ' )  
 	 	 	 {  
 	 	 	 	 q u e u e . o f f e r ( c ) ;  
 	 	 	 } e l s e   i f ( c = = ' ) ' )  
 	 	 	 {  
 	 	 	 	 i f ( q u e u e . i s E m p t y ( ) )  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 q u e u e . p o l l ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 r e t u r n   q u e u e . i s E m p t y ( ) ;  
 	 	  
 	 }  
 } 