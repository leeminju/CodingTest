s h o w   d a t a b a s e s ;  
  
 c r e a t e   t a b l e   m e m b e r (  
 	 i d   v a r c h a r ( 5 0 )   n o t   n u l l   p r i m a r y   k e y ,  
 	 p a s s w d   v a r c h a r ( 1 6 )   n o t   n u l l ,  
 	 n a m e   v a r c h a r ( 1 0 )   n o t   n u l l ,  
 	 r e g _ d a t e   d a t e t i m e   n o t   n u l l  
 	 ) ;  
 	  
 	 d e s c   m e m b e r ;  
 	  
 	 c r e a t e   t a b l e   t e s t (  
 	 n u m _ i d   i n t   n o t   n u l l   p r i m a r y   k e y   a u t o _ i n c r e m e n t ,  
 	 t i t l e   v a r c h a r ( 5 0 )   n o t   n u l l ,  
 	 c o n t e n t   t e x t   n o t   n u l l  
 	 ) ;  
 	  
 	 d e s c   t e s t ;  
 	  
 	 d r o p   t a b l e   t e s t ;  
 	  
 	 s h o w   t a b l e s ;  
 	  
 	 i n s e r t   i n t o   m e m b e r ( i d , p a s s w d , n a m e , r e g _ d a t e )   v a l u e s ( ' l e e m i n j u @ n a v e r . c o m ' , ' 1 2 3 4 ' , ' t�����' , n o w ( ) ) ;  
 	  
 	 s e l e c t   *   f r o m   m e m b e r ; 