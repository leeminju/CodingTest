p a c k a g e   H a s h ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
  
 p u b l i c   c l a s s   m u l t i l e v e l _ t o o t h b r u s h _ s a l e   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g [ ]   e n r o l l   =   {   " j o h n " ,   " m a r y " ,   " e d w a r d " ,   " s a m " ,   " e m i l y " ,   " j a i m i e " ,   " t o d " ,   " y o u n g "   } ;  
 	 	 S t r i n g [ ]   r e f e r r a l   =   {   " - " ,   " - " ,   " m a r y " ,   " e d w a r d " ,   " m a r y " ,   " m a r y " ,   " j a i m i e " ,   " e d w a r d "   } ;  
 	 	 S t r i n g [ ]   s e l l e r   =   {   " s a m " ,   " e m i l y " ,   " j a i m i e " ,   " e d w a r d "   } ;  
 	 	 i n t [ ]   a m o u n t   =   {   2 ,   3 ,   5 ,   4   } ;  
 	 	 S o l u t i o n 9   s o l   =   n e w   S o l u t i o n 9 ( ) ;  
 	 	 s o l . s o l u t i o n ( e n r o l l ,   r e f e r r a l ,   s e l l e r ,   a m o u n t ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 9   {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( S t r i n g [ ]   e n r o l l ,   S t r i n g [ ]   r e f e r r a l ,   S t r i n g [ ]   s e l l e r ,   i n t [ ]   a m o u n t )   {  
 	 	 i n t [ ]   a n s w e r   =   n e w   i n t [ e n r o l l . l e n g t h ] ;  
 	 	 H a s h M a p < S t r i n g , S e l l e r >   m a p =   n e w   H a s h M a p < > ( ) ;  
  
 	 	 S e l l e r   c e n t e r = n e w   S e l l e r ( " c e n t e r " ,   " t o p " ) ;  
 	 	 m a p . p u t ( " c e n t e r " ,   c e n t e r ) ;  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   e n r o l l . l e n g t h ;   i + + )   {  
 	 	 	 S t r i n g   p a r e n t = r e f e r r a l [ i ] ;  
 	 	 	 i f ( r e f e r r a l [ i ] = =   " - " )  
 	 	 	 {  
 	 	 	 	 p a r e n t = " c e n t e r " ;  
 	 	 	 }  
 	 	 	 S e l l e r   s = n e w   S e l l e r ( e n r o l l [ i ] ,   p a r e n t ) ;  
 	 	 	 m a p . p u t ( e n r o l l [ i ] ,   s ) ; 	  
 	 	 }  
 	 	  
 	  
 	 	  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < s e l l e r . l e n g t h ; i + + )  
 	 	 {  
 	 	 	 i n t   b e n ;  
 	 	 	 b e n =   a m o u n t [ i ] * 1 0 0 ;  
 	 	 	  
 	 	 	 i f ( b e n * 0 . 1 < 1 )  
 	 	 	 { 	  
 	 	 	 	 m a p . g e t ( s e l l e r [ i ] ) . b e n e f i t = b e n ;  
 	 	 	 } e l s e  
 	 	 	 {  
 	 	 	 	 m a p . g e t ( s e l l e r [ i ] ) . b e n e f i t   + =   ( i n t )   ( b e n - ( i n t ) ( b e n * 0 . 1 ) ) ;  
 	 	 	 	 S t r i n g   p a r e n t s = m a p . g e t ( s e l l e r [ i ] ) . p a r e n t s ;  
 	 	 	 	  
 	 	 	 	 w h i l e ( p a r e n t s   ! =   " t o p "   & &   m a p . g e t ( p a r e n t s ) ! = n u l l )  
 	 	 	 	 {  
 	 	 	 	 	 b e n   =   ( i n t )   ( ( i n t )   b e n   *   0 . 1 ) ;  
 	 	 	 	 	  
 	 	 	 	 	 i f ( b e n * 0 . 1   <   1 )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 m a p . g e t ( p a r e n t s ) . b e n e f i t   + =   b e n ;  
 	 	 	 	 	 	 b r e a k ;  
 	 	 	 	 	 } e l s e   {  
 	 	 	 	 	 	 m a p . g e t ( p a r e n t s ) . b e n e f i t   + =   ( i n t )   ( b e n - ( i n t ) ( b e n * 0 . 1 ) ) ;  
 	 	 	 	 	 	 p a r e n t s = m a p . g e t ( p a r e n t s ) . p a r e n t s ;  
 	 	 	 	 	 }  
 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 	  
 	 	 }  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < e n r o l l . l e n g t h ; i + + )  
 	 	 {  
 	 	 	 a n s w e r [ i ] = m a p . g e t ( e n r o l l [ i ] ) . b e n e f i t ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r [ i ] ) ;  
 	 	 }  
  
 	 	  
 	 	  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
  
 c l a s s   S e l l e r   {  
 	 S t r i n g   n a m e ;  
 	 S t r i n g   p a r e n t s ;  
 	 i n t   b e n e f i t ;  
  
 	 p u b l i c   S e l l e r ( S t r i n g   n a m e ,   S t r i n g   p a r e n t )   {  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 	 t h i s . p a r e n t s   =   p a r e n t ;  
 	 	 t h i s . b e n e f i t = 0 ;  
 	 }  
 	  
  
 } 