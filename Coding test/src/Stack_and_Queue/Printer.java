p a c k a g e   S t a c k _ a n d _ Q u e u e ;  
  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n s ;  
 i m p o r t   j a v a . u t i l . L i n k e d L i s t ;  
 i m p o r t   j a v a . u t i l . Q u e u e ;  
  
 p u b l i c   c l a s s   P r i n t e r   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 i n t [ ]   p r i o r i t i e s =   { 1 ,   1 ,   9 ,   1 ,   1 ,   1 } ;  
 	 	 i n t   l o c a t i o n = 0 ;  
 	 	 S o l u t i o n 4   s o l   =   n e w   S o l u t i o n 4 ( ) ;  
 	 	 s o l . s o l u t i o n ( p r i o r i t i e s ,   l o c a t i o n ) ;  
 	 } 	  
  
 }  
 c l a s s   S o l u t i o n 4   {  
         p u b l i c   i n t   s o l u t i o n ( i n t [ ]   p r i o r i t i e s ,   i n t   l o c a t i o n )   {  
         	  
         	 i n t   a n s w e r   =   0 ;  
         	 i n t   i d x = 0 ;  
         	 i n t   c o u n t = 0 ;  
                 Q u e u e < p r i n t >   q u e u e = n e w   L i n k e d L i s t < > ( ) ;  
                  
                 I n t e g e r [ ]   m a x   =   A r r a y s . s t r e a m ( p r i o r i t i e s ) . b o x e d ( ) . t o A r r a y ( I n t e g e r [ ] : : n e w ) ;  
                 A r r a y s . s o r t ( m a x ,   C o l l e c t i o n s . r e v e r s e O r d e r ( ) ) ;  
  
                  
              
                  
                 f o r ( i n t   i = 0 ; i < p r i o r i t i e s . l e n g t h ; i + + )  
                 {  
                 	 q u e u e . o f f e r ( n e w   p r i n t ( p r i o r i t i e s [ i ] , i ) ) ;  
                  
                 }  
                  
                 w h i l e ( q u e u e . s i z e ( ) > 0 )  
                 {  
                 	 i f ( m a x [ i d x ] > q u e u e . p e e k ( ) . i m p o r t a n c e )  
                 	 {  
                 	 	 q u e u e . o f f e r ( q u e u e . p o l l ( ) ) ; / / ��\�����0� 
                 	 } e l s e   {  
                 	 	 c o u n t + + ;  
                 	 	 i f ( q u e u e . p e e k ( ) . l o c a t i o n = = l o c a t i o n )  
                 	 	 {  
                 	 	 	 r e t u r n   c o u n t ;  
                 	 	 }  
                 	 	 q u e u e . p o l l ( ) ; / / ����0� 
                 	 	 i d x + + ;  
                 	 }  
                 }  
                  
                  
                 r e t u r n   a n s w e r ;  
         }  
 }  
 c l a s s   p r i n t {  
 	 i n t   i m p o r t a n c e ;  
 	 i n t   l o c a t i o n ;  
 	  
 	 p u b l i c   p r i n t ( i n t   i m p o r t a n c e , i n t   l o c a t i o n )  
 	 {  
 	 	 t h i s . i m p o r t a n c e = i m p o r t a n c e ;  
 	 	 t h i s . l o c a t i o n = l o c a t i o n ;  
 	 }  
 } 