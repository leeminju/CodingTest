p a c k a g e   l v 2 ;  
  
 p u b l i c   c l a s s   t e s t 1   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S o l u t i o n   s o l   =   n e w   S o l u t i o n ( ) ;  
 	 	 s o l . s o l u t i o n ( 3 ,   4 ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n   {  
 	 p u b l i c   l o n g   s o l u t i o n ( l o n g   w ,   l o n g   h )   {  
 	 	 l o n g   a n s w e r   =   0 ;  
 	 	 l o n g   m i n   =   M a t h . m i n ( w ,   h ) ;  
 	 	 l o n g   g c d   =   0 ;  
  
 	 	 i f   ( w   = =   1   | |   h   = =   1 )   {  
 	 	 	 a n s w e r   =   0 ;  
 	 	 	 r e t u r n   a n s w e r ;  
 	 	 }  
 	 	 / /   \? ?  ??}?? 
 	 	 f o r   ( l o n g   i   =   m i n ;   i   > =   1 ;   i - - )   {  
 	 	 	 i f   ( w   %   i   = =   0   & &   h   %   i   = =   0 )   {  
 	 	 	 	 g c d   =   i ;  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 }  
  
 	 	 i f   ( g c d   >   1 )   {  
 	 	 	 a n s w e r   =   ( w * h ) - ( w + h - g c d ) ;  
 	 	 } e l s e   i f ( g c d   = = 1 ) {  
 	 	 	 a n s w e r   =   ( w * h ) - ( w + h - 1 ) ;  
 	 	 }  
 	 	  
 	 	  
 	 	  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 