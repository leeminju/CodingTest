p a c k a g e   B a s i c ;  
 i m p o r t   j a v a . u t i l . * ;  
  
  
 p u b l i c   c l a s s   O r d e r _ o f _ c a r e   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )  
 	 {  
 	 	 i n t [ ]   e m e r g e n c y =   { 3 ,   7 6 ,   2 4 } ;  
 	 	  
 	 	 S o l u t i o n 4   s = n e w   S o l u t i o n 4 ( ) ;  
 	 	 s . s o l u t i o n ( e m e r g e n c y ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 4   {  
         p u b l i c   i n t [ ]   s o l u t i o n ( i n t [ ]   e m e r g e n c y )   {  
                 i n t [ ]   a n s w e r   =   n e w   i n t [ e m e r g e n c y . l e n g t h ] ;  
                 i n t [ ]   a r r   =   e m e r g e n c y . c l o n e ( ) ;  
                  
                 I n t e g e r [ ]   i n t e g e r A r r   =   A r r a y s . s t r e a m ( a r r ) . b o x e d ( ) . t o A r r a y ( I n t e g e r [ ] : : n e w ) ;  
                 A r r a y s . s o r t ( i n t e g e r A r r ,   C o l l e c t i o n s . r e v e r s e O r d e r ( ) ) ;  
                  
                  
                 f o r ( i n t   i = 0 ; i < e m e r g e n c y . l e n g t h ; i + + )  
                 {  
                 	 f o r ( i n t   j = 0 ; j < i n t e g e r A r r . l e n g t h ; j + + )  
                 	 {  
                 	 	 i f ( e m e r g e n c y [ i ] = = ( i n t ) i n t e g e r A r r [ j ] )  
                 	 	 {  
                 	 	 	 a n s w e r [ i ] = j + 1 ;  
                 	 	 }  
                 	 }  
                 }  
                  
                  
                 r e t u r n   a n s w e r ;  
         }  
 }  
 