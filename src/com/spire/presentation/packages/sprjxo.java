/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgaa;
import com.spire.presentation.packages.sprjsg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.prefs.Preferences;

public class sprjxo {
    private static final int cfr_renamed_272 = 5;
    private static Method cfr_renamed_145;
    public static final int cfr_renamed_114 = Integer.MIN_VALUE;
    private static final int cfr_renamed_96 = 0;
    private static Method cfr_renamed_105;
    private static final String cfr_renamed_137 = "HKEY_CLASSES_ROOT";
    public static final int cfr_renamed_79 = -2147483646;
    private static Method cfr_renamed_107;
    private static final int cfr_renamed_132 = 2;
    public static final String cfr_renamed_102 = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Fonts";
    private static final String cfr_renamed_93 = "HKEY_LOCAL_MACHINE";
    private static Method cfr_renamed_86;
    private static Method cfr_renamed_152;
    private static Preferences cfr_renamed_112;
    private static final String cfr_renamed_119 = "HKEY_CURRENT_USER";
    private static final int cfr_renamed_91 = 983103;
    private static Method cfr_renamed_0;
    public static final int cfr_renamed_1 = -2147483647;
    private static final int cfr_renamed_2 = 131097;
    private static Class<? extends Preferences> cfr_renamed_3;
    private static Preferences cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_18666(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        arg0 = new StringBuilder().insert(0, arg0).append(sprjsg.cfr_renamed_9("Q")).toString();
        return arg0.getBytes();
    }

    private static /* synthetic */ void cfr_renamed_18667(int arg0, String arg1, String arg2, List<String> arg3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        String string = sprjxo.cfr_renamed_18668(arg0, arg1, arg2);
        if (string != null) {
            arg3.add(string);
        }
    }

    private static /* synthetic */ Map<String, String> cfr_renamed_18669(int arg0, String arg1) throws IOException {
        String string;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Process process = Runtime.getRuntime().exec(new StringBuilder().insert(0, sprhgaa.cfr_renamed_9("o\u0015zPl\u0005x\u0002dP?")).append(sprjxo.cfr_renamed_18670(arg0)).append("\\").append(arg1).append(sprjsg.cfr_renamed_9("s")).toString());
        BufferedReader bufferedReader2 = bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((string = bufferedReader2.readLine()) != null) {
            String[] stringArray;
            if (!string.contains(sprhgaa.cfr_renamed_9("\"X7B"))) {
                bufferedReader2 = bufferedReader;
                continue;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string, sprjsg.cfr_renamed_9("\u0004X"));
            while (stringTokenizer.hasMoreTokens()) {
                stringArray = stringTokenizer.nextToken();
                if (stringArray.startsWith(sprhgaa.cfr_renamed_9("\"X7B"))) {
                    stringBuilder.append(sprjsg.cfr_renamed_9("-q"));
                    continue;
                }
                stringBuilder.append((String)stringArray).append(" ");
            }
            stringArray = stringBuilder.toString().split(sprhgaa.cfr_renamed_9("\u0014"));
            bufferedReader2 = bufferedReader;
            hashMap.put(stringArray[0].trim(), stringArray[1].trim());
            stringBuilder.setLength(0);
        }
        return hashMap;
    }

    private static /* synthetic */ String cfr_renamed_18670(int arg0) {
        if (arg0 == Integer.MIN_VALUE) {
            return cfr_renamed_137;
        }
        if (arg0 == -2147483647) {
            return cfr_renamed_119;
        }
        if (arg0 == -2147483646) {
            return cfr_renamed_93;
        }
        return null;
    }

    private static /* synthetic */ Map<String, String> cfr_renamed_18671(Preferences arg0, int arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        int n;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Object[] objectArray = new Object[3];
        objectArray[0] = new Integer(arg1);
        objectArray[1] = sprjxo.cfr_renamed_18666(arg2);
        objectArray[2] = new Integer(131097);
        int[] nArray = (int[])cfr_renamed_145.invoke(arg0, objectArray);
        if (nArray[1] != 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjsg.cfr_renamed_9("\u0005L4\u0004\"]\"P4IqG0JqJ>PqB8J5\u0004%L4\u0004\"T4G8B8A5\u0004!E%Lk\u0004v")).append(sprjxo.cfr_renamed_18670(arg1)).append("\\").append(arg2).append(sprhgaa.cfr_renamed_9(":")).toString());
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = new Integer(nArray[0]);
        int[] nArray2 = (int[])cfr_renamed_107.invoke(arg0, objectArray2);
        int n2 = nArray2[2];
        int n3 = nArray2[4];
        int n4 = n = 0;
        while (n4 < n2) {
            Object[] objectArray3 = new Object[3];
            objectArray3[0] = new Integer(nArray[0]);
            objectArray3[1] = new Integer(n);
            objectArray3[2] = new Integer(n3 + 1);
            byte[] byArray = (byte[])cfr_renamed_105.invoke(arg0, objectArray3);
            String string = sprjxo.cfr_renamed_18672(byArray);
            if (byArray == null || string.isEmpty()) {
                return sprjxo.cfr_renamed_18669(arg1, arg2);
            }
            hashMap.put(string, sprjxo.cfr_renamed_18673(arg0, arg1, arg2, string));
            n4 = ++n;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = new Integer(nArray[0]);
        cfr_renamed_86.invoke(arg0, objectArray4);
        return hashMap;
    }

    private static /* synthetic */ String cfr_renamed_18674(int arg0, String arg1, String arg2) throws IOException {
        return sprjxo.cfr_renamed_18669(arg0, arg1).get(arg2);
    }

    public static Map<String, String> cfr_renamed_18675(int arg0, String arg1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        if (arg0 != -2147483646 || !arg1.equals(cfr_renamed_102)) {
            throw new IllegalArgumentException(sprjsg.cfr_renamed_9("m?R0H8@qO4]qK#\u0004'E=Q4"));
        }
        if (arg0 == -2147483646) {
            return sprjxo.cfr_renamed_18671(cfr_renamed_4, arg0, arg1);
        }
        if (arg0 == -2147483647) {
            return sprjxo.cfr_renamed_18671(cfr_renamed_112, arg0, arg1);
        }
        return sprjxo.cfr_renamed_18671(null, arg0, arg1);
    }

    private static /* synthetic */ List<String> cfr_renamed_18676(Preferences arg0, int arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        int n;
        ArrayList<String> arrayList = new ArrayList<String>();
        Object[] objectArray = new Object[3];
        objectArray[0] = new Integer(arg1);
        objectArray[1] = sprjxo.cfr_renamed_18666(arg2);
        objectArray[2] = new Integer(131097);
        int[] nArray = (int[])cfr_renamed_145.invoke(arg0, objectArray);
        if (nArray[1] != 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhgaa.cfr_renamed_9("I\u0018xPn\tn\u0004x\u001d=\u0013|\u001e=\u001er\u0004=\u0016t\u001eyPi\u0018xPn\u0000x\u0013t\u0016t\u0015yPm\u0011i\u0018'P:")).append(sprjxo.cfr_renamed_18670(arg1)).append("\\").append(arg2).append(sprjsg.cfr_renamed_9("v")).toString());
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = new Integer(nArray[0]);
        int[] nArray2 = (int[])cfr_renamed_107.invoke(arg0, objectArray2);
        int n2 = nArray2[0];
        int n3 = nArray2[3];
        int n4 = n = 0;
        while (n4 < n2) {
            Object[] objectArray3 = new Object[3];
            objectArray3[0] = new Integer(nArray[0]);
            objectArray3[1] = new Integer(n);
            objectArray3[2] = new Integer(n3 + 1);
            byte[] byArray = (byte[])cfr_renamed_0.invoke(arg0, objectArray3);
            arrayList.add(sprjxo.cfr_renamed_18672(byArray));
            n4 = ++n;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = new Integer(nArray[0]);
        cfr_renamed_86.invoke(arg0, objectArray4);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String cfr_renamed_18677(int arg0, String arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        try {
            return sprjxo.cfr_renamed_18678(arg0, arg1, arg2).get(0);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhgaa.cfr_renamed_9("$u\u0015=\u0003d\u0003i\u0015pP~\u0011sPs\u001fiP{\u0019s\u0014=\u0004u\u0015=\u001bx\t'P:")).append(arg2).append(sprjsg.cfr_renamed_9("\u0003qE7P4Vq")).append(sprhgaa.cfr_renamed_9("n\u0015|\u0002~\u0018t\u001ezPi\u0018xPn\u0000x\u0013t\u0016t\u0015yPm\u0011i\u0018'P:")).append(sprjxo.cfr_renamed_18670(arg0)).append("\\").append(arg1).append(sprjsg.cfr_renamed_9("v")).toString());
        }
    }

    private static /* synthetic */ String cfr_renamed_18672(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        String string = new String(arg0);
        if (string.charAt(string.length() - 1) == '\u0000') {
            String string2 = string;
            return string2.substring(0, string2.length() - 1);
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        cfr_renamed_112 = Preferences.userRoot();
        cfr_renamed_4 = Preferences.systemRoot();
        cfr_renamed_3 = cfr_renamed_112.getClass();
        cfr_renamed_145 = null;
        cfr_renamed_86 = null;
        cfr_renamed_152 = null;
        cfr_renamed_105 = null;
        cfr_renamed_107 = null;
        cfr_renamed_0 = null;
        try {
            Class[] classArray = new Class[3];
            classArray[0] = Integer.TYPE;
            classArray[1] = byte[].class;
            classArray[2] = Integer.TYPE;
            cfr_renamed_145 = cfr_renamed_3.getDeclaredMethod(sprhgaa.cfr_renamed_9("J\u0019s\u0014r\u0007n\"x\u0017R\u0000x\u001eV\u0015d"), classArray);
            cfr_renamed_145.setAccessible(true);
            Class[] classArray2 = new Class[1];
            classArray2[0] = Integer.TYPE;
            cfr_renamed_86 = cfr_renamed_3.getDeclaredMethod(sprjsg.cfr_renamed_9("s8J5K&W\u0003A6g=K\"A\u001aA("), classArray2);
            cfr_renamed_86.setAccessible(true);
            Class[] classArray3 = new Class[2];
            classArray3[0] = Integer.TYPE;
            classArray3[1] = byte[].class;
            cfr_renamed_152 = cfr_renamed_3.getDeclaredMethod(sprhgaa.cfr_renamed_9("'t\u001ey\u001fj\u0003O\u0015z!h\u0015o\tK\u0011q\u0005x5e"), classArray3);
            cfr_renamed_152.setAccessible(true);
            Class[] classArray4 = new Class[3];
            classArray4[0] = Integer.TYPE;
            classArray4[1] = Integer.TYPE;
            classArray4[2] = Integer.TYPE;
            cfr_renamed_105 = cfr_renamed_3.getDeclaredMethod(sprjsg.cfr_renamed_9("\u0006M?@>S\"v4C\u0014J$I\u0007E=Q4"), classArray4);
            cfr_renamed_105.setAccessible(true);
            Class[] classArray5 = new Class[1];
            classArray5[0] = Integer.TYPE;
            cfr_renamed_107 = cfr_renamed_3.getDeclaredMethod(sprhgaa.cfr_renamed_9("J\u0019s\u0014r\u0007n\"x\u0017L\u0005x\u0002d9s\u0016r;x\t,"), classArray5);
            cfr_renamed_107.setAccessible(true);
            Class[] classArray6 = new Class[3];
            classArray6[0] = Integer.TYPE;
            classArray6[1] = Integer.TYPE;
            classArray6[2] = Integer.TYPE;
            cfr_renamed_0 = cfr_renamed_3.getDeclaredMethod(sprjsg.cfr_renamed_9("\u0006M?@>S\"v4C\u0014J$I\u001aA(a)"), classArray6);
            cfr_renamed_0.setAccessible(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static /* synthetic */ List<String> cfr_renamed_18679(int arg0, String arg1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        if (arg0 == -2147483646) {
            return sprjxo.cfr_renamed_18676(cfr_renamed_4, arg0, arg1);
        }
        if (arg0 == -2147483647) {
            return sprjxo.cfr_renamed_18676(cfr_renamed_112, arg0, arg1);
        }
        return sprjxo.cfr_renamed_18676(null, arg0, arg1);
    }

    private static /* synthetic */ String cfr_renamed_18673(Preferences arg0, int arg1, String arg2, String arg3) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        Object[] objectArray = new Object[3];
        objectArray[0] = new Integer(arg1);
        objectArray[1] = sprjxo.cfr_renamed_18666(arg2);
        objectArray[2] = new Integer(131097);
        int[] nArray = (int[])cfr_renamed_145.invoke(arg0, objectArray);
        if (nArray[1] != 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhgaa.cfr_renamed_9("I\u0018xPn\tn\u0004x\u001d=\u0013|\u001e=\u001er\u0004=\u0016t\u001eyPi\u0018xPn\u0000x\u0013t\u0016t\u0015yPm\u0011i\u0018'P:")).append(sprjxo.cfr_renamed_18670(arg1)).append("\\").append(arg2).append(sprjsg.cfr_renamed_9("v")).toString());
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[0] = new Integer(nArray[0]);
        objectArray2[1] = sprjxo.cfr_renamed_18666(arg3);
        byte[] byArray = (byte[])cfr_renamed_152.invoke(arg0, objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = new Integer(nArray[0]);
        cfr_renamed_86.invoke(arg0, objectArray3);
        if (byArray != null) {
            return sprjxo.cfr_renamed_18672(byArray);
        }
        return sprjxo.cfr_renamed_18674(arg1, arg2, arg3);
    }

    private static /* synthetic */ List<String> cfr_renamed_18680(Preferences arg0, int arg1, String arg2, String arg3, List<String> arg4) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        Iterator<String> iterator;
        if (!sprjxo.cfr_renamed_18681(arg0, arg1, arg2)) {
            sprjxo.cfr_renamed_18667(arg1, arg2, arg3, arg4);
            return arg4;
        }
        Iterator<String> iterator2 = iterator = sprjxo.cfr_renamed_18676(arg0, arg1, arg2).iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            String string2 = new StringBuilder().insert(0, arg2).append("\\").append(string).toString();
            if (sprjxo.cfr_renamed_18681(arg0, arg1, string2)) {
                sprjxo.cfr_renamed_18680(arg0, arg1, string2, arg3, arg4);
            }
            sprjxo.cfr_renamed_18667(arg1, string2, arg3, arg4);
            iterator2 = iterator;
        }
        return arg4;
    }

    private static /* synthetic */ String cfr_renamed_18668(int arg0, String arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        if (arg0 == -2147483646) {
            return sprjxo.cfr_renamed_18673(cfr_renamed_4, arg0, arg1, arg2);
        }
        if (arg0 == -2147483647) {
            return sprjxo.cfr_renamed_18673(cfr_renamed_112, arg0, arg1, arg2);
        }
        return sprjxo.cfr_renamed_18673(null, arg0, arg1, arg2);
    }

    private static /* synthetic */ boolean cfr_renamed_18681(Preferences arg0, int arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return !sprjxo.cfr_renamed_18676(arg0, arg1, arg2).isEmpty();
    }

    private static /* synthetic */ List<String> cfr_renamed_18678(int arg0, String arg1, String arg2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (arg0 == -2147483646) {
            return sprjxo.cfr_renamed_18680(cfr_renamed_4, arg0, arg1, arg2, arrayList);
        }
        if (arg0 == -2147483647) {
            return sprjxo.cfr_renamed_18680(cfr_renamed_112, arg0, arg1, arg2, arrayList);
        }
        return sprjxo.cfr_renamed_18680(null, arg0, arg1, arg2, arrayList);
    }
}

