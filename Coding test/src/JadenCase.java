 
 p u b l i c   c l a s s   J a d e n C a s e   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g   s   =   "     f o r         t h e   l a s t   w e e k     " ;  
 	 / / 	                       "     F o r         T h e   L a s t   W e e k     "  
 	 	 S o l u t i o n 1 6   s o l   =   n e w   S o l u t i o n 1 6 ( ) ;  
 	 	 s o l . s o l u t i o n ( s ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 1 6   {  
 	 p u b l i c   S t r i n g   s o l u t i o n ( S t r i n g   s )   {  
 	 	 S t r i n g   a n s w e r   =   " " ;  
  
 	 	 S t r i n g [ ]   w o r d s   =   s . s p l i t ( "   " ) ;  
  
 	 	 f o r   ( i n t   j   =   0 ;   j   <   w o r d s . l e n g t h ;   j + + )   {  
 	 	 	 S t r i n g B u i l d e r   s b   =   n e w   S t r i n g B u i l d e r ( w o r d s [ j ] ) ;  
  
 	 	 	 S y s t e m . o u t . p r i n t l n ( j   +   " : "   +   w o r d s [ j ] ) ;  
 	 	 	 i f   ( w o r d s [ j ]   = =   "   " )   {  
  
 	 	 	 }   e l s e   {  
 	 	 	 	 i f   ( w o r d s [ j ] . l e n g t h ( )   >   0 )   {  
 	 	 	 	 	 i f   ( ' a '   < =   w o r d s [ j ] . c h a r A t ( 0 )   & &   w o r d s [ j ] . c h a r A t ( 0 )   < =   ' z ' )   {  
 	 	 	 	 	 	 s b . s e t C h a r A t ( 0 ,   C h a r a c t e r . t o U p p e r C a s e ( w o r d s [ j ] . c h a r A t ( 0 ) ) ) ;  
 	 	 	 	 	 }  
  
 	 	 	 	 	 f o r   ( i n t   i   =   1 ;   i   <   w o r d s [ j ] . l e n g t h ( ) ;   i + + )   {  
 	 	 	 	 	 	 i f   ( ' A '   < =   w o r d s [ j ] . c h a r A t ( i )   & &   w o r d s [ j ] . c h a r A t ( i )   < =   ' Z ' )   {  
 	 	 	 	 	 	 	 s b . s e t C h a r A t ( i ,   C h a r a c t e r . t o L o w e r C a s e ( w o r d s [ j ] . c h a r A t ( i ) ) ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 }  
  
 	 	 	 }  
  
 	 	 	 i f   ( j   ! =   w o r d s . l e n g t h   -   1 )  
 	 	 	 	 a n s w e r   + =   s b . t o S t r i n g ( )   +   "   " ;  
 	 	 	 e l s e  
 	 	 	 	 a n s w e r   + =   s b . t o S t r i n g ( ) ;  
  
 	 	 }  
  
 	 	 S y s t e m . o u t . p r i n t l n ( s . l e n g t h ( )   -   a n s w e r . l e n g t h ( ) ) ;  
 	 	  
 	 	 i f   ( s . l e n g t h ( )   -   a n s w e r . l e n g t h ( )   >   0 )   {  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   < =   s . l e n g t h ( )   -   a n s w e r . l e n g t h ( ) ;   i + + )  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( i ) ;  
 	 	 	 	 a n s w e r   + =   "   " ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
  
 	 	 r e t u r n   a n s w e r ;  
  
 	 }  
 } 