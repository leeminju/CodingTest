p a c k a g e   c h 0 2 ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 / * *  
   *   S e r v l e t   i m p l e m e n t a t i o n   c l a s s   H e l l o S e r v l e t  
   * /  
 @ W e b S e r v l e t ( " / H e l l o S e r v l e t " )  
 p u b l i c   c l a s s   H e l l o S e r v l e t   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
                
         / * *  
           *   @ s e e   H t t p S e r v l e t # H t t p S e r v l e t ( )  
           * /  
         p u b l i c   H e l l o S e r v l e t ( )   {  
                 s u p e r ( ) ;  
                 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
         }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	  
 	 	 r e s p o n s e . s e t C o n t e n t T y p e ( " t e x t / h t m l ; c h a r s e t = u t f - 8 " ) ;  
 	 	 t r y   {  
 	 	 	 P r i n t W r i t e r   o u t   =   r e s p o n s e . g e t W r i t e r ( ) ;  
 	 	 	 o u t . p r i n t l n ( " < H T M L > " ) ;  
 	 	 	 o u t . p r i n t l n ( " < H E A D > < T I T L E > S e r v l e t   ????< / T I T L E > < / H E A D > " ) ;  
 	 	 	 o u t . p r i n t l n ( " < B O D Y > " ) ;  
 	 	 	 o u t . p r i n t l n ( " ??L?  ??1?X???  S e r v l e t " ) ;  
 	 	 	 o u t . p r i n t l n ( " < / B O D Y > " ) ;  
 	 	 	 o u t . p r i n t l n ( " < / H T M L > " ) ;  
 	 	 	 o u t . c l o s e ( ) ;  
 	 	 	  
 	 	 } c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 g e t S e r v l e t C o n t e x t ( ) . l o g ( " E r r o r   i n   H e l l o S e r v l e t : " , e ) ;  
 	 	 }  
 	 	  
 	 / / 	 r e s p o n s e . g e t W r i t e r ( ) . a p p e n d ( " S e r v e d   a t :   " ) . a p p e n d ( r e q u e s t . g e t C o n t e x t P a t h ( ) ) ;  
 	 }  
 	  
 	  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 d o G e t ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
 }  
 