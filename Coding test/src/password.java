 
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
  
 p u b l i c   c l a s s   p a s s w o r d   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g   s   =   " a u k k s " ;  
 	 	 S t r i n g   s k i p   =   " w b q d " ;  
 	 	 i n t   i n d e x   =   2 0 ;  
 	 	 S o l u t i o n 5   s o l   =   n e w   S o l u t i o n 5 ( ) ;  
 	 	 s o l . s o l u t i o n ( s ,   s k i p ,   i n d e x ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 5   {  
 	 p u b l i c   S t r i n g   s o l u t i o n ( S t r i n g   s ,   S t r i n g   s k i p ,   i n t   i n d e x )   {  
 	 	 S t r i n g B u f f e r   a n s w e r   =   n e w   S t r i n g B u f f e r ( ) ;  
 	 	 S t r i n g [ ]   a l p h a b e t   =   {   " a " ,   " b " ,   " c " ,   " d " ,   " e " ,   " f " ,   " g " ,   " h " ,   " i " ,   " j " ,   " k " ,   " l " ,   " m " ,   " n " ,   " o " ,   " p " ,   " q " ,   " r " ,  
 	 	 	 	 " s " ,   " t " ,   " u " ,   " v " ,   " w " ,   " x " ,   " y " ,   " z "   } ;  
  
 	 	 L i s t < S t r i n g >   a l p t   =   n e w   A r r a y L i s t < > ( A r r a y s . a s L i s t ( a l p h a b e t ) ) ;  
 	 	 L i s t < S t r i n g >   s k i p l i s t   =   n e w   A r r a y L i s t < > ( ) ;  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   s k i p . l e n g t h ( ) ;   i + + )   {  
 	 	 	 s k i p l i s t . a d d ( C h a r a c t e r . t o S t r i n g ( s k i p . c h a r A t ( i ) ) ) ;  
 	 	 }  
 	 	  
 	 	 a l p t . r e m o v e A l l ( s k i p l i s t ) ;  
 	 	  
 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   s . l e n g t h ( ) ;   i + + )   {  
 	 	 	 i n t   n e w _ i n d e x   =   a l p t . i n d e x O f ( C h a r a c t e r . t o S t r i n g ( s . c h a r A t ( i ) ) )   +   i n d e x   ;  
 	 	 	  
 	 	 	 i f ( n e w _ i n d e x   <   a l p t . s i z e ( ) )  
 	 	 	 {  
 	 	 	 	 / / S y s t e m . o u t . p r i n t l n ( a l p t . g e t ( n e w _ i n d e x ) ) ;  
 	 	 	 	 a n s w e r . a p p e n d ( a l p t . g e t ( n e w _ i n d e x ) ) ;  
 	 	 	 } e l s e   {  
 	 	 	 	 n e w _ i n d e x   - =   a l p t . s i z e ( ) * ( n e w _ i n d e x / a l p t . s i z e ( ) ) ;  
 	 	 	 	 / / S y s t e m . o u t . p r i n t l n ( a l p t . g e t ( n e w _ i n d e x ) ) ;  
 	 	 	 	 a n s w e r . a p p e n d ( a l p t . g e t ( n e w _ i n d e x ) ) ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   a n s w e r . t o S t r i n g ( ) ;  
  
 	 }  
 } 