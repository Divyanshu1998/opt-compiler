class BinaryTree {
public static void main(String[] a) {
BT t1;
int t2;
t1 = new BT();
t2 = t1.Start();
System.out.println(t2);
}
}
class BT {
public int Start ( ) {
Tree t3;
int t5;
boolean t4;
boolean t6;
int t7;
int t9;
boolean t8;
boolean t10;
int t12;
boolean t11;
int t14;
boolean t13;
int t16;
boolean t15;
int t18;
boolean t17;
int t20;
boolean t19;
int t22;
boolean t21;
boolean t23;
int t25;
int t24;
int t27;
int t26;
int t29;
int t28;
int t31;
int t30;
int t33;
int t32;
int t35;
boolean t34;
boolean t36;
int t38;
int t37;
int t39;
Tree root;
boolean ntb;
int nti;
t3 = new Tree();
root = t3;
t5 = 16;
t4 = root.Init(t5);
ntb = t4;
t6 = root.Print();
ntb = t6;
t7 = 100000000;
System.out.println(t7);
t9 = 8;
t8 = root.Insert(t9);
ntb = t8;
t10 = root.Print();
ntb = t10;
t12 = 24;
t11 = root.Insert(t12);
ntb = t11;
t14 = 4;
t13 = root.Insert(t14);
ntb = t13;
t16 = 12;
t15 = root.Insert(t16);
ntb = t15;
t18 = 20;
t17 = root.Insert(t18);
ntb = t17;
t20 = 28;
t19 = root.Insert(t20);
ntb = t19;
t22 = 14;
t21 = root.Insert(t22);
ntb = t21;
t23 = root.Print();
ntb = t23;
t25 = 24;
t24 = root.Search(t25);
System.out.println(t24);
t27 = 12;
t26 = root.Search(t27);
System.out.println(t26);
t29 = 16;
t28 = root.Search(t29);
System.out.println(t28);
t31 = 50;
t30 = root.Search(t31);
System.out.println(t30);
t33 = 12;
t32 = root.Search(t33);
System.out.println(t32);
t35 = 12;
t34 = root.Delete(t35);
ntb = t34;
t36 = root.Print();
ntb = t36;
t38 = 12;
t37 = root.Search(t38);
System.out.println(t37);
t39 = 0;
return t39;
}
}
class Tree {
Tree left;
Tree right;
int key;
boolean has_left;
boolean has_right;
Tree my_null;
public boolean Init (int v_key ) {
boolean t40;
key = v_key;
has_left = false;
has_right = false;
t40 = true;
return t40;
}
public boolean SetRight (Tree rn ) {
boolean t41;
right = rn;
t41 = true;
return t41;
}
public boolean SetLeft (Tree ln ) {
boolean t42;
left = ln;
t42 = true;
return t42;
}
public Tree GetRight ( ) {
return right;
}
public Tree GetLeft ( ) {
return left;
}
public int GetKey ( ) {
return key;
}
public boolean SetKey (int v_key ) {
boolean t43;
key = v_key;
t43 = true;
return t43;
}
public boolean GetHas_Right ( ) {
return has_right;
}
public boolean GetHas_Left ( ) {
return has_left;
}
public boolean SetHas_Left (boolean val ) {
boolean t44;
has_left = val;
t44 = true;
return t44;
}
public boolean SetHas_Right (boolean val ) {
boolean t45;
has_right = val;
t45 = true;
return t45;
}
public boolean Compare (int num1,int num2 ) {
int t46;
int t47;
boolean t48;
boolean t49;
boolean t50;
boolean ntb;
int nti;
ntb = false;
t46 = 1;
t47 = num2+t46;
nti = t47;
t48 = num1<num2;
if(t48){
ntb = false;
}
else {
t49 = num1<nti;
t50 = !t49;
if(t50){
ntb = false;
}
else {
ntb = true;
}
}
return ntb;
}
public boolean Insert (int v_key ) {
Tree t51;
boolean t52;
Tree t53;
int t54;
boolean t55;
boolean t56;
Tree t57;
boolean t59;
boolean t58;
boolean t60;
boolean t61;
Tree t62;
boolean t64;
boolean t63;
boolean t65;
boolean t66;
Tree new_node;
boolean ntb;
boolean cont;
int key_aux;
Tree current_node;
t51 = new Tree();
new_node = t51;
t52 = new_node.Init(v_key);
ntb = t52;
t53 = this;
current_node = t53;
cont = true;
while(cont)
{
{
t54 = current_node.GetKey();
key_aux = t54;
t55 = v_key<key_aux;
if(t55){
{
t56 = current_node.GetHas_Left();
if(t56){
t57 = current_node.GetLeft();
current_node = t57;
}
else {
{
cont = false;
t59 = true;
t58 = current_node.SetHas_Left(t59);
ntb = t58;
t60 = current_node.SetLeft(new_node);
ntb = t60;
}
}
}
}
else {
{
t61 = current_node.GetHas_Right();
if(t61){
t62 = current_node.GetRight();
current_node = t62;
}
else {
{
cont = false;
t64 = true;
t63 = current_node.SetHas_Right(t64);
ntb = t63;
t65 = current_node.SetRight(new_node);
ntb = t65;
}
}
}
}
}
}
t66 = true;
return t66;
}
public boolean Delete (int v_key ) {
Tree t67;
Tree t68;
int t69;
boolean t70;
boolean t71;
Tree t72;
boolean t73;
boolean t74;
Tree t75;
boolean t76;
boolean t77;
boolean t78;
boolean t79;
boolean t80;
Tree t81;
boolean t82;
Tree t83;
boolean t84;
Tree current_node;
Tree parent_node;
boolean cont;
boolean found;
boolean is_root;
int key_aux;
boolean ntb;
t67 = this;
current_node = t67;
t68 = this;
parent_node = t68;
cont = true;
found = false;
is_root = true;
while(cont)
{
{
t69 = current_node.GetKey();
key_aux = t69;
t70 = v_key<key_aux;
if(t70){
t71 = current_node.GetHas_Left();
if(t71){
{
parent_node = current_node;
t72 = current_node.GetLeft();
current_node = t72;
}
}
else {
cont = false;
}
}
else {
t73 = key_aux<v_key;
if(t73){
t74 = current_node.GetHas_Right();
if(t74){
{
parent_node = current_node;
t75 = current_node.GetRight();
current_node = t75;
}
}
else {
cont = false;
}
}
else {
{
if(is_root){
t76 = current_node.GetHas_Right();
t77 = !t76;
t78 = current_node.GetHas_Left();
t79 = !t78;
t80 = t77&t79;
if(t80){
ntb = true;
}
else {
t81 = this;
t82 = t81.Remove(parent_node,current_node);
ntb = t82;
}
}
else {
t83 = this;
t84 = t83.Remove(parent_node,current_node);
ntb = t84;
}
found = true;
cont = false;
}
}
}
is_root = false;
}
}
return found;
}
public boolean Remove (Tree p_node,Tree c_node ) {
boolean t85;
Tree t86;
boolean t87;
boolean t88;
Tree t89;
boolean t90;
int t91;
Tree t92;
int t93;
Tree t94;
boolean t95;
boolean t96;
boolean t98;
boolean t97;
boolean t99;
boolean t101;
boolean t100;
boolean t102;
boolean ntb;
int auxkey1;
int auxkey2;
t85 = c_node.GetHas_Left();
if(t85){
t86 = this;
t87 = t86.RemoveLeft(p_node,c_node);
ntb = t87;
}
else {
t88 = c_node.GetHas_Right();
if(t88){
t89 = this;
t90 = t89.RemoveRight(p_node,c_node);
ntb = t90;
}
else {
{
t91 = c_node.GetKey();
auxkey1 = t91;
t92 = p_node.GetLeft();
t93 = t92.GetKey();
auxkey2 = t93;
t94 = this;
t95 = t94.Compare(auxkey1,auxkey2);
if(t95){
{
t96 = p_node.SetLeft(my_null);
ntb = t96;
t98 = false;
t97 = p_node.SetHas_Left(t98);
ntb = t97;
}
}
else {
{
t99 = p_node.SetRight(my_null);
ntb = t99;
t101 = false;
t100 = p_node.SetHas_Right(t101);
ntb = t100;
}
}
}
}
}
t102 = true;
return t102;
}
public boolean RemoveRight (Tree p_node,Tree c_node ) {
boolean t103;
Tree t105;
int t106;
boolean t104;
Tree t107;
boolean t108;
boolean t110;
boolean t109;
boolean t111;
boolean ntb;
t103 = c_node.GetHas_Right();
while(t103)
{
{
t105 = c_node.GetRight();
t106 = t105.GetKey();
t104 = c_node.SetKey(t106);
ntb = t104;
p_node = c_node;
t107 = c_node.GetRight();
c_node = t107;
}
t103 = c_node.GetHas_Right();
}
t108 = p_node.SetRight(my_null);
ntb = t108;
t110 = false;
t109 = p_node.SetHas_Right(t110);
ntb = t109;
t111 = true;
return t111;
}
public boolean RemoveLeft (Tree p_node,Tree c_node ) {
boolean t112;
Tree t114;
int t115;
boolean t113;
Tree t116;
boolean t117;
boolean t119;
boolean t118;
boolean t120;
boolean ntb;
t112 = c_node.GetHas_Left();
while(t112)
{
{
t114 = c_node.GetLeft();
t115 = t114.GetKey();
t113 = c_node.SetKey(t115);
ntb = t113;
p_node = c_node;
t116 = c_node.GetLeft();
c_node = t116;
}
t112 = c_node.GetHas_Left();
}
t117 = p_node.SetLeft(my_null);
ntb = t117;
t119 = false;
t118 = p_node.SetHas_Left(t119);
ntb = t118;
t120 = true;
return t120;
}
public int Search (int v_key ) {
Tree t121;
int t122;
boolean t123;
boolean t124;
Tree t125;
boolean t126;
boolean t127;
Tree t128;
boolean cont;
int ifound;
Tree current_node;
int key_aux;
t121 = this;
current_node = t121;
cont = true;
ifound = 0;
while(cont)
{
{
t122 = current_node.GetKey();
key_aux = t122;
t123 = v_key<key_aux;
if(t123){
t124 = current_node.GetHas_Left();
if(t124){
t125 = current_node.GetLeft();
current_node = t125;
}
else {
cont = false;
}
}
else {
t126 = key_aux<v_key;
if(t126){
t127 = current_node.GetHas_Right();
if(t127){
t128 = current_node.GetRight();
current_node = t128;
}
else {
cont = false;
}
}
else {
{
ifound = 1;
cont = false;
}
}
}
}
}
return ifound;
}
public boolean Print ( ) {
Tree t129;
Tree t130;
boolean t131;
boolean t132;
Tree current_node;
boolean ntb;
t129 = this;
current_node = t129;
t130 = this;
t131 = t130.RecPrint(current_node);
ntb = t131;
t132 = true;
return t132;
}
public boolean RecPrint (Tree node ) {
boolean t133;
Tree t134;
Tree t136;
boolean t135;
int t137;
boolean t138;
Tree t139;
Tree t141;
boolean t140;
boolean t142;
boolean ntb;
t133 = node.GetHas_Left();
if(t133){
{
t134 = this;
t136 = node.GetLeft();
t135 = t134.RecPrint(t136);
ntb = t135;
}
}
else {
ntb = true;
}
t137 = node.GetKey();
System.out.println(t137);
t138 = node.GetHas_Right();
if(t138){
{
t139 = this;
t141 = node.GetRight();
t140 = t139.RecPrint(t141);
ntb = t140;
}
}
else {
ntb = true;
}
t142 = true;
return t142;
}
}
