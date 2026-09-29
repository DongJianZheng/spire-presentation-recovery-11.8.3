/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhbh;
import com.spire.presentation.packages.sprhik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprsxy;
import com.spire.presentation.packages.sprsze;
import com.spire.presentation.packages.sprtok;
import com.spire.presentation.packages.sprvik;
import com.spire.presentation.packages.sprvxg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class spronk {
    private static final Set<Character> cfr_renamed_2 = new sprhik();
    private final ArrayList<Object> cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static spronk cfr_renamed_9633(InputStream arg0, int arg1) throws IOException {
        spronk spronk2 = null;
        return spronk.cfr_renamed_9634(arg0, spronk2, new ByteArrayOutputStream(), arg1);
    }

    public spronk cfr_renamed_8039(int arg0) {
        return (spronk)this.cfr_renamed_3.get(arg0);
    }

    public sprhbh cfr_renamed_8052() {
        Iterator<Object> iterator;
        sprvxg sprvxg2 = sprhbh.cfr_renamed_7843();
        Iterator<Object> iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            Iterator<Object> iterator3 = iterator;
            iterator2 = iterator3;
            sprvxg2.cfr_renamed_8053(iterator3.next());
        }
        return sprvxg2.cfr_renamed_1451();
    }

    public void cfr_renamed_8034(Object arg0) {
        this.cfr_renamed_3.add(arg0);
    }

    private /* synthetic */ void cfr_renamed_9635(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_9636(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, char c) throws IOException {
        int n;
        void arg1;
        InputStream inputStream2 = inputStream;
        arg1.reset();
        boolean bl = false;
        while ((n = inputStream2.read()) > -1) {
            void arg2;
            InputStream arg0;
            if (bl && n <= 32) {
                bl = false;
                inputStream2 = arg0;
                continue;
            }
            if (n == 10) {
                bl = true;
                inputStream2 = arg0;
                continue;
            }
            if (arg2 == n) {
                return n;
            }
            arg1.write(n);
            inputStream2 = arg0;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_9637(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, char c) throws IOException {
        int n;
        void arg1;
        InputStream inputStream2 = inputStream;
        arg1.reset();
        while ((n = inputStream2.read()) > -1) {
            InputStream arg0;
            void arg2;
            if (n == arg2) {
                return;
            }
            arg1.write(n);
            inputStream2 = arg0;
        }
    }

    public static /* synthetic */ ArrayList cfr_renamed_9638(spronk arg0) {
        return arg0.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spronk(List<Object> list) {
        void arg0;
        spronk spronk2 = this;
        this.cfr_renamed_3 = new ArrayList();
        this.cfr_renamed_4 = false;
        this.cfr_renamed_3.addAll((Collection<Object>)arg0);
    }

    public String cfr_renamed_8040(int arg0) {
        Object object = this.cfr_renamed_3.get(arg0);
        if (object instanceof byte[]) {
            return sprkoe.cfr_renamed_427((byte[])object);
        }
        return this.cfr_renamed_3.get(arg0).toString();
    }

    public boolean cfr_renamed_9639() {
        return this.cfr_renamed_4;
    }

    public spronk cfr_renamed_8037(String ... arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(Arrays.asList(arg0));
        spronk spronk2 = new spronk();
        Iterator<Object> iterator = this.cfr_renamed_3.iterator();
        block0: while (true) {
            Iterator<Object> iterator2 = iterator;
            while (iterator2.hasNext()) {
                Object object = iterator.next();
                if (hashSet.contains(object.toString())) {
                    iterator2 = iterator;
                    continue;
                }
                if (object instanceof spronk) {
                    String string;
                    if (!((spronk)object).cfr_renamed_3.isEmpty() && hashSet.contains(string = ((spronk)object).cfr_renamed_3.get(0).toString())) {
                        iterator2 = iterator;
                        continue;
                    }
                    spronk2.cfr_renamed_3.add(((spronk)object).cfr_renamed_8037(arg0));
                    continue block0;
                }
                spronk2.cfr_renamed_3.add(object);
                continue block0;
            }
            break;
        }
        return spronk2;
    }

    public Object cfr_renamed_9640(int arg0) {
        return this.cfr_renamed_3.get(arg0);
    }

    public spronk cfr_renamed_8051(String arg0) {
        for (Object object : this.cfr_renamed_3) {
            if (!(object instanceof spronk) || !((spronk)object).cfr_renamed_8030(arg0)) continue;
            return (spronk)object;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsxy.cfr_renamed_9("F^HZF\u001f")).append(arg0).append(sprdtd.cfr_renamed_9("(\\iX(Eg_(Mg^fO")).toString());
    }

    public spronk cfr_renamed_8045(String arg0) {
        for (Object object : this.cfr_renamed_3) {
            if (!(object instanceof spronk) || !((spronk)object).cfr_renamed_8030(arg0)) continue;
            return (spronk)object;
        }
        return null;
    }

    public byte[] cfr_renamed_4491(int arg0) {
        return (byte[])this.cfr_renamed_3.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_9641(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, Set<Character> set) throws IOException {
        int n;
        void arg1;
        InputStream inputStream2 = inputStream;
        arg1.reset();
        boolean bl = false;
        while ((n = inputStream2.read()) > -1) {
            void arg2;
            InputStream arg0;
            if (bl && n <= 32) {
                bl = false;
                inputStream2 = arg0;
                continue;
            }
            if (n == 10) {
                bl = true;
                inputStream2 = arg0;
                continue;
            }
            if (arg2.contains(sprsze.cfr_renamed_5223((char)n))) {
                return n;
            }
            arg1.write(n);
            inputStream2 = arg0;
        }
        return -1;
    }

    public static sprvik cfr_renamed_7843() {
        return new sprvik();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_8038() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.cfr_renamed_9642(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new spreah(exception.getMessage(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_9643(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, char c) throws IOException {
        int n;
        void arg1;
        InputStream inputStream2 = inputStream;
        arg1.reset();
        while ((n = inputStream2.read()) > -1) {
            void arg2;
            InputStream arg0;
            if (n <= 32) {
                inputStream2 = arg0;
                continue;
            }
            if (n == arg2) {
                return;
            }
            arg1.write(n);
            inputStream2 = arg0;
        }
    }

    public List<Object> cfr_renamed_205() {
        return this.cfr_renamed_3;
    }

    public spronk cfr_renamed_8044(String ... arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(Arrays.asList(arg0));
        spronk spronk2 = new spronk();
        Iterator<Object> iterator = this.cfr_renamed_3.iterator();
        block0: while (true) {
            Iterator<Object> iterator2 = iterator;
            while (iterator2.hasNext()) {
                Object object = iterator.next();
                if (object instanceof spronk) {
                    String string;
                    if (!((spronk)object).cfr_renamed_3.isEmpty() && !hashSet.contains(string = ((spronk)object).cfr_renamed_3.get(0).toString())) {
                        iterator2 = iterator;
                        continue;
                    }
                    spronk2.cfr_renamed_3.add(object);
                    continue block0;
                }
                if (!hashSet.contains(object.toString())) {
                    iterator2 = iterator;
                    continue;
                }
                spronk2.cfr_renamed_3.add(object);
                continue block0;
            }
            break;
        }
        return spronk2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ spronk cfr_renamed_9634(InputStream arg0, spronk arg1, ByteArrayOutputStream arg2, int arg3) throws IOException {
        Object var4_4 = null;
        if (arg2 == null) {
            arg2 = new ByteArrayOutputStream();
        }
        if (--arg3 < 0) {
            throw new IllegalStateException(sprsxy.cfr_renamed_9("l\u0007zROXZYLCPD\u001fOGIZO[O[\nRKGCR_R\n[OO^W"));
        }
        int n = 0;
        do {
            InputStream inputStream = arg0;
            while (true) {
                if ((n = spronk.cfr_renamed_9641(inputStream, arg2, cfr_renamed_2)) == 58) {
                    int n2 = Integer.parseInt(sprkoe.cfr_renamed_184(arg2.toByteArray()));
                    byte[] byArray = new byte[n2];
                    InputStream inputStream2 = arg0;
                    inputStream = inputStream2;
                    sprkqe.cfr_renamed_476(inputStream2, byArray);
                    spronk spronk2 = arg1;
                    spronk2.cfr_renamed_8034(byArray);
                    spronk2.cfr_renamed_9635(true);
                    continue;
                }
                if (arg2.size() > 0) {
                    arg1.cfr_renamed_8034(sprkoe.cfr_renamed_184(arg2.toByteArray()));
                }
                if (n == 40) {
                    if (arg1 == null) {
                        spronk spronk3 = arg1 = new spronk();
                        spronk.cfr_renamed_9634(arg0, spronk3, arg2, arg3);
                        return spronk3;
                    }
                    arg1.cfr_renamed_8034(spronk.cfr_renamed_9634(arg0, new spronk(), arg2, arg3));
                    inputStream = arg0;
                    continue;
                }
                if (n == 35) {
                    InputStream inputStream3 = arg0;
                    inputStream = inputStream3;
                    spronk.cfr_renamed_9643(inputStream3, arg2, '#');
                    arg1.cfr_renamed_8034(sprfqe.cfr_renamed_488(sprkoe.cfr_renamed_184(arg2.toByteArray())));
                    continue;
                }
                if (n != 34) break;
                InputStream inputStream4 = arg0;
                inputStream = inputStream4;
                spronk.cfr_renamed_9636(inputStream4, arg2, '\"');
                arg1.cfr_renamed_8034(new sprtok(sprkoe.cfr_renamed_184(arg2.toByteArray())));
            }
            if (n == 41) {
                return arg1;
            }
        } while (n != -1);
        ++arg3;
        return arg1;
    }

    public boolean cfr_renamed_8030(String arg0) {
        if (this.cfr_renamed_3.isEmpty()) {
            throw new IllegalArgumentException(sprdtd.cfr_renamed_9("x%np[zN{XaDf\u000baX(Ne[|R"));
        }
        Object object = this.cfr_renamed_3.get(0);
        return (object instanceof String || object instanceof sprtok ? (object = object.toString()) : (object = sprkoe.cfr_renamed_184((byte[])object))).equals(arg0);
    }

    public int cfr_renamed_8041(int arg0) {
        return Integer.parseInt(this.cfr_renamed_8040(arg0));
    }

    public spronk() {
        spronk spronk2 = this;
        this.cfr_renamed_3 = new ArrayList();
        this.cfr_renamed_4 = false;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9642(OutputStream outputStream) throws IOException {
        void arg0;
        arg0.write(40);
        boolean bl = false;
        for (Object object : this.cfr_renamed_3) {
            Object object2;
            if (object instanceof sprtok) {
                object2 = sprtok.cfr_renamed_9644((sprtok)object);
                void v0 = arg0;
                arg0.write(sprkoe.cfr_renamed_433(Integer.toString(((String)object2).length())));
                v0.write(58);
                v0.write(sprkoe.cfr_renamed_431((String)object2));
                continue;
            }
            if (object instanceof String) {
                object2 = (String)object;
                void v1 = arg0;
                arg0.write(sprkoe.cfr_renamed_433(Integer.toString(((String)object2).length())));
                v1.write(58);
                v1.write(sprkoe.cfr_renamed_431((String)object2));
                continue;
            }
            Object object3 = object;
            if (object instanceof byte[]) {
                object2 = (byte[])object3;
                arg0.write(sprkoe.cfr_renamed_433(Integer.toString(((Object)object2).length)));
                void v3 = arg0;
                v3.write(58);
                v3.write((byte[])object2);
                continue;
            }
            if (object3 instanceof spronk) {
                ((spronk)object).cfr_renamed_9642((OutputStream)arg0);
                continue;
            }
            throw new IllegalStateException(new StringBuilder().insert(0, sprsxy.cfr_renamed_9("JDWKQNSO[\nKSOO\u001f")).append(object.getClass().getName()).append(sprdtd.cfr_renamed_9("(Bf\u000b~Jd^m\u000bdB{_")).toString());
        }
        void v4 = arg0;
        v4.write(41);
        v4.flush();
    }

    public static spronk cfr_renamed_8042(byte[] arg0, int arg1) throws IOException {
        return spronk.cfr_renamed_9633(new ByteArrayInputStream(arg0), arg1);
    }
}

