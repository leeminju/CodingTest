p a c k a g e   l v 1 ;  
  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
  
 p u b l i c   c l a s s   S t r i n g _ r e v e r s e _ o r d e r   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )  
 	 {  
 	 	 S t r i n g   s = " Z b c d e f g " ;  
 	 	 S o l u t i o n 3   s o l = n e w   S o l u t i o n 3 ( ) ;  
 	 	 s o l . s o l u t i o n ( s ) ;  
 	 }  
 }  
 c l a s s   S o l u t i o n 3   {  
         p u b l i c   S t r i n g   s o l u t i o n ( S t r i n g   s )   {  
                 S t r i n g   a n s w e r   =   " " ;  
                  
                 c h a r [ ]   c h a r a r r = s . t o C h a r A r r a y ( ) ;  
                 A r r a y s . s o r t ( c h a r a r r ) ;  
                  
                 S t r i n g B u i l d e r   s b   =   n e w   S t r i n g B u i l d e r ( S t r i n g . v a l u e O f ( c h a r a r r ) ) ;  
                
                 a n s w e r = s b . r e v e r s e ( ) . t o S t r i n g ( ) ;  
              
                  
                 r e t u r n   a n s w e r ;  
         }  
 }  
 