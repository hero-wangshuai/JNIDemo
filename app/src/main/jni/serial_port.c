#include "com_github_king_jnidemo_MyJni.h"
/**
 * 上边的引用标签一定是.h的文件名家后缀，方法名一定要和.h文件中的方法名称一样
 */

JNIEXPORT jstring JNICALL Java_com_github_king_jnidemo_MyJni_stringFromJNI
        (JNIEnv *env, jobject ojb){
    return (*env) -> NewStringUTF(env,"Hello, I'm from jni");
}
