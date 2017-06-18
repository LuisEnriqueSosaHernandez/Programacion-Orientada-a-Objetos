

public class Burbuja{
public static void main(String[]arg){
int[]vec={-34,5,3,7,2,9,-737,1,34,56,100,283464,-2,763,24,2344,356,443234,7665,43234,424};
int aux;
for(int i=0;i<vec.length;i++){
System.out.print(vec[i]+" ");
}
System.out.print("\n");
for(int i=0;i<vec.length;i++){
for(int j=i+1;j<vec.length;j++){
if(vec[j]<vec[i]){
aux=vec[j];
vec[j]=vec[i];
vec[i]=aux;
}

}

}

for(int i=0;i<vec.length;i++){
System.out.print(vec[i]+" ");
}

}
}


