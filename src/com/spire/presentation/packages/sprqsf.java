/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprdjf;
import com.spire.presentation.packages.sprepy;
import com.spire.presentation.packages.sprhnf;
import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprjaz;
import com.spire.presentation.packages.sprjqf;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprojf;
import com.spire.presentation.packages.sprrof;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprvkf;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprxjf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public final class sprqsf
implements Serializable {
    private List<sprknf> cfr_renamed_132;
    private final List<sprrof> cfr_renamed_102;
    private Map<Integer, sprknf> cfr_renamed_93;
    private transient spraof cfr_renamed_86;
    private static final long cfr_renamed_152 = 1L;
    private sprknf cfr_renamed_112;
    private Stack<sprknf> cfr_renamed_119;
    private transient int cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private final int cfr_renamed_3;
    private Map<Integer, LinkedList<sprknf>> cfr_renamed_4;

    public int cfr_renamed_5747() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeInt(this.cfr_renamed_91);
    }

    public sprqsf cfr_renamed_5807(sprlem arg0) {
        return new sprqsf(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprqsf(sprlpf sprlpf2, byte[] byArray, byte[] byArray2, sprrqf sprrqf2) {
        void arg3;
        void arg2;
        void arg0;
        sprqsf sprqsf2 = this;
        sprqsf2(arg0.cfr_renamed_5783(), arg0.cfr_renamed_1452(), arg0.cfr_renamed_1150(), (1 << arg0.cfr_renamed_1452()) - 1);
        sprqsf2.cfr_renamed_5901(byArray, (byte[])arg2, (sprrqf)arg3);
    }

    public boolean cfr_renamed_1399() {
        return this.cfr_renamed_1;
    }

    public sprknf cfr_renamed_1411() {
        return this.cfr_renamed_112;
    }

    private /* synthetic */ sprqsf(sprqsf arg0, sprlem arg1) {
        sprqsf sprqsf2 = this;
        sprqsf sprqsf3 = arg0;
        sprqsf sprqsf4 = this;
        sprqsf4.cfr_renamed_86 = new spraof(new sprirf(arg1));
        this.cfr_renamed_3 = sprqsf3.cfr_renamed_3;
        sprqsf2.cfr_renamed_0 = sprqsf3.cfr_renamed_0;
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprqsf2.cfr_renamed_132 = new ArrayList<sprknf>();
        this.cfr_renamed_132.addAll(arg0.cfr_renamed_132);
        this.cfr_renamed_4 = new TreeMap<Integer, LinkedList<sprknf>>();
        Iterator<Serializable> iterator = arg0.cfr_renamed_4.keySet().iterator();
        Iterator<Integer> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Integer n;
            Integer n2 = n = iterator.next();
            this.cfr_renamed_4.put(n2, (LinkedList)arg0.cfr_renamed_4.get(n2).clone());
            iterator2 = iterator;
        }
        this.cfr_renamed_119 = new Stack();
        this.cfr_renamed_119.addAll(arg0.cfr_renamed_119);
        this.cfr_renamed_102 = new ArrayList<sprrof>();
        iterator = arg0.cfr_renamed_102.iterator();
        Iterator<Serializable> iterator3 = iterator;
        while (iterator3.hasNext()) {
            this.cfr_renamed_102.add(((sprrof)iterator.next()).cfr_renamed_1316());
            iterator3 = iterator;
        }
        sprqsf sprqsf5 = this;
        sprqsf sprqsf6 = arg0;
        this.cfr_renamed_93 = new TreeMap<Integer, sprknf>(arg0.cfr_renamed_93);
        this.cfr_renamed_2 = sprqsf6.cfr_renamed_2;
        sprqsf5.cfr_renamed_91 = sprqsf6.cfr_renamed_91;
        sprqsf5.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_5902();
    }

    public sprqsf cfr_renamed_5804(int arg0, sprlem arg1) {
        return new sprqsf(this, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprqsf(sprlpf sprlpf2, int n, int n2) {
        void arg1;
        void arg2;
        void arg0;
        sprqsf sprqsf2 = this;
        this(arg0.cfr_renamed_5783(), arg0.cfr_renamed_1452(), arg0.cfr_renamed_1150(), (int)arg2);
        this.cfr_renamed_91 = arg1;
        sprqsf2.cfr_renamed_2 = arg2;
        sprqsf2.cfr_renamed_1 = true;
    }

    public int cfr_renamed_5797() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ sprqsf(spraof arg0, int arg1, int arg2, int arg3) {
        int n;
        sprqsf sprqsf2 = this;
        this.cfr_renamed_86 = arg0;
        sprqsf2.cfr_renamed_3 = arg1;
        sprqsf2.cfr_renamed_91 = arg3;
        this.cfr_renamed_0 = arg2;
        if (this.cfr_renamed_0 > arg1 || arg2 < 2 || (arg1 - arg2) % 2 != 0) {
            throw new IllegalArgumentException(sprepy.cfr_renamed_9("O8J1A5JtP5J!Ct@;Ttd\u0010utV5T5K1R1TtM"));
        }
        sprqsf sprqsf3 = this;
        sprqsf3.cfr_renamed_132 = new ArrayList<sprknf>();
        sprqsf sprqsf4 = this;
        sprqsf3.cfr_renamed_4 = new TreeMap<Integer, LinkedList<sprknf>>();
        sprqsf4.cfr_renamed_119 = new Stack();
        sprqsf3.cfr_renamed_102 = new ArrayList<sprrof>();
        int n2 = n = 0;
        while (n2 < arg1 - arg2) {
            this.cfr_renamed_102.add(new sprrof(n++));
            n2 = n;
        }
        sprqsf sprqsf5 = this;
        sprqsf5.cfr_renamed_93 = new TreeMap<Integer, sprknf>();
        sprqsf5.cfr_renamed_2 = 0;
        this.cfr_renamed_1 = 0;
    }

    public void cfr_renamed_1405() {
        this.cfr_renamed_1 = true;
    }

    private /* synthetic */ void cfr_renamed_5903(byte[] arg0, byte[] arg1, sprrqf arg2) {
        int n;
        Serializable serializable;
        Object object;
        if (arg2 == null) {
            throw new NullPointerException(sprjaz.cfr_renamed_9("W;K\u0007Y<P\u000e\\+J*K<\u0018r\u0005oV:T#"));
        }
        if (this.cfr_renamed_1) {
            throw new IllegalStateException(sprepy.cfr_renamed_9("=H0C,\u00065J&C5B-\u0006!U1B"));
        }
        sprqsf sprqsf2 = this;
        if (sprqsf2.cfr_renamed_2 > sprqsf2.cfr_renamed_91 - 1) {
            throw new IllegalStateException(sprjaz.cfr_renamed_9("&V+]7\u0018 M;\u0018 ^oZ M!\\<"));
        }
        sprqsf sprqsf3 = this;
        int n2 = sprvof.cfr_renamed_5762(sprqsf3.cfr_renamed_2, sprqsf3.cfr_renamed_3);
        if ((sprqsf3.cfr_renamed_2 >> n2 + 1 & 1) == 0 && n2 < this.cfr_renamed_3 - 1) {
            this.cfr_renamed_93.put(n2, this.cfr_renamed_132.get(n2));
        }
        sprdjf sprdjf2 = (sprdjf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_1451();
        sprjqf sprjqf2 = (sprjqf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_1451();
        if (n2 == 0) {
            arg2 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5776(this.cfr_renamed_2).cfr_renamed_5873(arg2.cfr_renamed_5877()).cfr_renamed_5874(arg2.cfr_renamed_5875()).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
            sprqsf sprqsf4 = this;
            this.cfr_renamed_86.cfr_renamed_5766(sprqsf4.cfr_renamed_86.cfr_renamed_5767(arg1, arg2), arg0);
            object = sprqsf4.cfr_renamed_86.cfr_renamed_5880(arg2);
            sprdjf2 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(sprdjf2.cfr_renamed_5734())).cfr_renamed_5735(sprdjf2.cfr_renamed_5736())).cfr_renamed_5737(this.cfr_renamed_2).cfr_renamed_5743(sprdjf2.cfr_renamed_5747()).cfr_renamed_5739(sprdjf2.cfr_renamed_5744()).cfr_renamed_5745(sprdjf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprqsf sprqsf5 = this;
            serializable = sprvkf.cfr_renamed_5742(sprqsf5.cfr_renamed_86, (sprojf)object, sprdjf2);
            sprqsf5.cfr_renamed_132.set(0, (sprknf)serializable);
        } else {
            int n3;
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(n2 - 1).cfr_renamed_5739(this.cfr_renamed_2 >> n2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprqsf sprqsf6 = this;
            this.cfr_renamed_86.cfr_renamed_5766(sprqsf6.cfr_renamed_86.cfr_renamed_5767(arg1, arg2), arg0);
            object = sprvkf.cfr_renamed_5748(sprqsf6.cfr_renamed_86, this.cfr_renamed_132.get(n2 - 1), this.cfr_renamed_93.get(n2 - 1), sprjqf2);
            object = new sprknf(((sprknf)object).cfr_renamed_1452() + 1, ((sprknf)object).cfr_renamed_97());
            this.cfr_renamed_132.set(n2, (sprknf)object);
            this.cfr_renamed_93.remove(n2 - 1);
            int n4 = 0;
            int n5 = n4;
            while (n5 < n2) {
                sprqsf sprqsf7 = this;
                if (n4 < sprqsf7.cfr_renamed_3 - sprqsf7.cfr_renamed_0) {
                    sprqsf sprqsf8 = this;
                    int n6 = n4;
                    sprqsf8.cfr_renamed_132.set(n6, sprqsf8.cfr_renamed_102.get(n6).cfr_renamed_5897());
                } else {
                    sprqsf sprqsf9 = this;
                    int n7 = n4;
                    sprqsf9.cfr_renamed_132.set(n7, sprqsf9.cfr_renamed_4.get(n7).removeFirst());
                }
                n5 = ++n4;
            }
            sprqsf sprqsf10 = this;
            n4 = Math.min(n2, sprqsf10.cfr_renamed_3 - sprqsf10.cfr_renamed_0);
            int n8 = n3 = 0;
            while (n8 < n4) {
                int n9 = this.cfr_renamed_2 + 1 + 3 * (1 << n3);
                if (n9 < 1 << this.cfr_renamed_3) {
                    this.cfr_renamed_102.get(n3).cfr_renamed_5894(n9);
                }
                n8 = ++n3;
            }
        }
        int n10 = n = 0;
        while (true) {
            sprqsf sprqsf11 = this;
            if (n10 >= sprqsf11.cfr_renamed_3 - sprqsf11.cfr_renamed_0 >> 1) break;
            serializable = this.cfr_renamed_5904();
            if (serializable != null) {
                sprqsf sprqsf12 = this;
                ((sprrof)serializable).cfr_renamed_5893(sprqsf12.cfr_renamed_119, sprqsf12.cfr_renamed_86, arg0, arg1, arg2);
            }
            n10 = ++n;
        }
        ++this.cfr_renamed_2;
    }

    private /* synthetic */ sprqsf(sprqsf arg0, byte[] arg1, byte[] arg2, sprrqf arg3) {
        sprqsf sprqsf2 = this;
        sprqsf sprqsf3 = arg0;
        sprqsf sprqsf4 = this;
        sprqsf4.cfr_renamed_86 = new spraof(arg0.cfr_renamed_86.cfr_renamed_2110());
        this.cfr_renamed_3 = sprqsf3.cfr_renamed_3;
        sprqsf2.cfr_renamed_0 = sprqsf3.cfr_renamed_0;
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprqsf2.cfr_renamed_132 = new ArrayList<sprknf>();
        this.cfr_renamed_132.addAll(arg0.cfr_renamed_132);
        this.cfr_renamed_4 = new TreeMap<Integer, LinkedList<sprknf>>();
        Iterator<Serializable> iterator = arg0.cfr_renamed_4.keySet().iterator();
        Iterator<Integer> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Integer n;
            Integer n2 = n = iterator.next();
            this.cfr_renamed_4.put(n2, (LinkedList)arg0.cfr_renamed_4.get(n2).clone());
            iterator2 = iterator;
        }
        this.cfr_renamed_119 = new Stack();
        this.cfr_renamed_119.addAll(arg0.cfr_renamed_119);
        this.cfr_renamed_102 = new ArrayList<sprrof>();
        iterator = arg0.cfr_renamed_102.iterator();
        Iterator<Serializable> iterator3 = iterator;
        while (iterator3.hasNext()) {
            this.cfr_renamed_102.add(((sprrof)iterator.next()).cfr_renamed_1316());
            iterator3 = iterator;
        }
        sprqsf sprqsf5 = this;
        sprqsf sprqsf6 = arg0;
        this.cfr_renamed_93 = new TreeMap<Integer, sprknf>(arg0.cfr_renamed_93);
        this.cfr_renamed_2 = sprqsf6.cfr_renamed_2;
        sprqsf5.cfr_renamed_91 = sprqsf6.cfr_renamed_91;
        sprqsf5.cfr_renamed_1 = false;
        this.cfr_renamed_5903(arg1, arg2, arg3);
    }

    public sprqsf cfr_renamed_5798(byte[] arg0, byte[] arg1, sprrqf arg2) {
        return new sprqsf(this, arg0, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_5901(byte[] arg0, byte[] arg1, sprrqf arg2) {
        int n;
        if (arg2 == null) {
            throw new NullPointerException(sprepy.cfr_renamed_9(";R'n5U<g0B&C'Ut\u001bi\u0006:S8J"));
        }
        sprdjf sprdjf2 = (sprdjf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_1451();
        sprjqf sprjqf2 = (sprjqf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_1451();
        int n2 = n = 0;
        while (n2 < 1 << this.cfr_renamed_3) {
            arg2 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5776(n).cfr_renamed_5873(arg2.cfr_renamed_5877()).cfr_renamed_5874(arg2.cfr_renamed_5875()).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
            sprqsf sprqsf2 = this;
            this.cfr_renamed_86.cfr_renamed_5766(sprqsf2.cfr_renamed_86.cfr_renamed_5767(arg1, arg2), arg0);
            sprojf sprojf2 = sprqsf2.cfr_renamed_86.cfr_renamed_5880(arg2);
            sprdjf2 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(sprdjf2.cfr_renamed_5734())).cfr_renamed_5735(sprdjf2.cfr_renamed_5736())).cfr_renamed_5737(n).cfr_renamed_5743(sprdjf2.cfr_renamed_5747()).cfr_renamed_5739(sprdjf2.cfr_renamed_5744()).cfr_renamed_5745(sprdjf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprknf sprknf2 = sprvkf.cfr_renamed_5742(this.cfr_renamed_86, sprojf2, sprdjf2);
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5739(n).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprqsf sprqsf3 = this;
            while (!sprqsf3.cfr_renamed_119.isEmpty() && this.cfr_renamed_119.peek().cfr_renamed_1452() == sprknf2.cfr_renamed_1452()) {
                int n3 = n / (1 << sprknf2.cfr_renamed_1452());
                if (n3 == 1) {
                    this.cfr_renamed_132.add(sprknf2);
                }
                if (n3 == 3) {
                    sprqsf sprqsf4 = this;
                    if (sprknf2.cfr_renamed_1452() < sprqsf4.cfr_renamed_3 - sprqsf4.cfr_renamed_0) {
                        this.cfr_renamed_102.get(sprknf2.cfr_renamed_1452()).cfr_renamed_5899(sprknf2);
                    }
                }
                if (n3 >= 3 && (n3 & 1) == 1) {
                    sprqsf sprqsf5 = this;
                    if (sprknf2.cfr_renamed_1452() >= sprqsf5.cfr_renamed_3 - sprqsf5.cfr_renamed_0 && sprknf2.cfr_renamed_1452() <= this.cfr_renamed_3 - 2) {
                        if (this.cfr_renamed_4.get(sprknf2.cfr_renamed_1452()) == null) {
                            LinkedList<sprknf> linkedList = new LinkedList<sprknf>();
                            linkedList.add(sprknf2);
                            this.cfr_renamed_4.put(sprknf2.cfr_renamed_1452(), linkedList);
                        } else {
                            this.cfr_renamed_4.get(sprknf2.cfr_renamed_1452()).add(sprknf2);
                        }
                    }
                }
                sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747()).cfr_renamed_5739((sprjqf2.cfr_renamed_5744() - 1) / 2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
                sprqsf sprqsf6 = this;
                sprknf2 = sprvkf.cfr_renamed_5748(sprqsf6.cfr_renamed_86, sprqsf6.cfr_renamed_119.pop(), sprknf2, sprjqf2);
                sprknf2 = new sprknf(sprknf2.cfr_renamed_1452() + 1, sprknf2.cfr_renamed_97());
                sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747() + 1).cfr_renamed_5739(sprjqf2.cfr_renamed_5744()).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
                sprqsf3 = this;
            }
            this.cfr_renamed_119.push(sprknf2);
            n2 = ++n;
        }
        this.cfr_renamed_112 = this.cfr_renamed_119.pop();
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        block6: {
            block5: {
                sprqsf sprqsf2;
                ObjectInputStream objectInputStream = arg0;
                objectInputStream.defaultReadObject();
                if (objectInputStream.available() != 0) {
                    sprqsf2 = this;
                    this.cfr_renamed_91 = arg0.readInt();
                } else {
                    sprqsf2 = this;
                    this.cfr_renamed_91 = (1 << this.cfr_renamed_3) - 1;
                }
                if (sprqsf2.cfr_renamed_91 > (1 << this.cfr_renamed_3) - 1) break block5;
                sprqsf sprqsf3 = this;
                if (sprqsf3.cfr_renamed_2 <= sprqsf3.cfr_renamed_91 + 1 && arg0.available() == 0) break block6;
            }
            throw new IOException(sprjaz.cfr_renamed_9("Q![ V<Q<L*V;\u0018\r|\u001c\u0018+Y;Yo\\*L*[;]+"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprqsf(sprlpf sprlpf2, byte[] byArray, byte[] byArray2, sprrqf sprrqf2, int n) {
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        sprqsf sprqsf2 = this;
        sprqsf sprqsf3 = sprqsf2;
        sprqsf2(arg0.cfr_renamed_5783(), arg0.cfr_renamed_1452(), arg0.cfr_renamed_1150(), (1 << arg0.cfr_renamed_1452()) - 1);
        sprqsf2.cfr_renamed_5901(byArray, (byte[])arg2, (sprrqf)arg3);
        while (sprqsf3.cfr_renamed_2 < arg4) {
            void arg1;
            sprqsf sprqsf4 = this;
            sprqsf3 = sprqsf4;
            sprqsf4.cfr_renamed_5903((byte[])arg1, (byte[])arg2, (sprrqf)arg3);
            sprqsf4.cfr_renamed_1 = false;
        }
    }

    private /* synthetic */ sprrof cfr_renamed_5904() {
        sprrof sprrof2 = null;
        Iterator<sprrof> iterator = this.cfr_renamed_102.iterator();
        block0: while (true) {
            Iterator<sprrof> iterator2 = iterator;
            while (iterator2.hasNext()) {
                sprrof sprrof3 = iterator.next();
                if (sprrof3.cfr_renamed_5896()) continue block0;
                if (!sprrof3.cfr_renamed_5898()) {
                    iterator2 = iterator;
                    continue;
                }
                if (sprrof2 == null) {
                    sprrof2 = sprrof3;
                    iterator2 = iterator;
                    continue;
                }
                if (sprrof3.cfr_renamed_1452() < sprrof2.cfr_renamed_1452()) {
                    sprrof2 = sprrof3;
                    iterator2 = iterator;
                    continue;
                }
                if (sprrof3.cfr_renamed_1452() != sprrof2.cfr_renamed_1452() || sprrof3.cfr_renamed_5895() >= sprrof2.cfr_renamed_5895()) continue block0;
                sprrof2 = sprrof3;
                continue block0;
            }
            break;
        }
        return sprrof2;
    }

    public sprqsf(sprqsf arg0) {
        sprqsf sprqsf2 = this;
        sprqsf sprqsf3 = arg0;
        sprqsf sprqsf4 = this;
        sprqsf4.cfr_renamed_86 = new spraof(arg0.cfr_renamed_86.cfr_renamed_2110());
        this.cfr_renamed_3 = sprqsf3.cfr_renamed_3;
        sprqsf2.cfr_renamed_0 = sprqsf3.cfr_renamed_0;
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprqsf2.cfr_renamed_132 = new ArrayList<sprknf>();
        this.cfr_renamed_132.addAll(arg0.cfr_renamed_132);
        this.cfr_renamed_4 = new TreeMap<Integer, LinkedList<sprknf>>();
        Iterator<Serializable> iterator = arg0.cfr_renamed_4.keySet().iterator();
        Iterator<Integer> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Integer n;
            Integer n2 = n = iterator.next();
            this.cfr_renamed_4.put(n2, (LinkedList)arg0.cfr_renamed_4.get(n2).clone());
            iterator2 = iterator;
        }
        this.cfr_renamed_119 = new Stack();
        this.cfr_renamed_119.addAll(arg0.cfr_renamed_119);
        this.cfr_renamed_102 = new ArrayList<sprrof>();
        iterator = arg0.cfr_renamed_102.iterator();
        Iterator<Serializable> iterator3 = iterator;
        while (iterator3.hasNext()) {
            this.cfr_renamed_102.add(((sprrof)iterator.next()).cfr_renamed_1316());
            iterator3 = iterator;
        }
        sprqsf sprqsf5 = this;
        sprqsf sprqsf6 = arg0;
        sprqsf sprqsf7 = this;
        sprqsf7.cfr_renamed_93 = new TreeMap<Integer, sprknf>(arg0.cfr_renamed_93);
        sprqsf7.cfr_renamed_2 = arg0.cfr_renamed_2;
        sprqsf5.cfr_renamed_91 = sprqsf6.cfr_renamed_91;
        sprqsf5.cfr_renamed_1 = sprqsf6.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_5902() {
        if (this.cfr_renamed_132 == null) {
            throw new IllegalStateException(sprepy.cfr_renamed_9("5S N1H O7G O;H\u0004G Nt\u001bi\u0006:S8J"));
        }
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprjaz.cfr_renamed_9("J*L.Q!\u0018r\u0005oV:T#"));
        }
        if (this.cfr_renamed_119 == null) {
            throw new IllegalStateException(sprepy.cfr_renamed_9("U G7Mt\u001bi\u0006:S8J"));
        }
        if (this.cfr_renamed_102 == null) {
            throw new IllegalStateException(sprjaz.cfr_renamed_9(";J*]\u0007Y<P\u0006V<L.V,]<\u0018r\u0005oV:T#"));
        }
        if (this.cfr_renamed_93 == null) {
            throw new IllegalStateException(sprepy.cfr_renamed_9("?C1Vt\u001bi\u0006:S8J"));
        }
        sprqsf sprqsf2 = this;
        if (!sprvof.cfr_renamed_5764(sprqsf2.cfr_renamed_3, sprqsf2.cfr_renamed_2)) {
            throw new IllegalStateException(sprjaz.cfr_renamed_9("Q!\\*@oQ!\u0018\r|\u001c\u0018<L.L*\u0018 M;\u0018 ^oZ M!\\<"));
        }
    }

    private /* synthetic */ sprqsf(sprqsf arg0, int arg1, sprlem arg2) {
        sprqsf sprqsf2 = this;
        sprqsf sprqsf3 = arg0;
        sprqsf sprqsf4 = this;
        sprqsf4.cfr_renamed_86 = new spraof(new sprirf(arg2));
        this.cfr_renamed_3 = sprqsf3.cfr_renamed_3;
        sprqsf2.cfr_renamed_0 = sprqsf3.cfr_renamed_0;
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprqsf2.cfr_renamed_132 = new ArrayList<sprknf>();
        this.cfr_renamed_132.addAll(arg0.cfr_renamed_132);
        this.cfr_renamed_4 = new TreeMap<Integer, LinkedList<sprknf>>();
        Iterator<Serializable> iterator = arg0.cfr_renamed_4.keySet().iterator();
        Iterator<Integer> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Integer n;
            Integer n2 = n = iterator.next();
            this.cfr_renamed_4.put(n2, (LinkedList)arg0.cfr_renamed_4.get(n2).clone());
            iterator2 = iterator;
        }
        this.cfr_renamed_119 = new Stack();
        this.cfr_renamed_119.addAll(arg0.cfr_renamed_119);
        this.cfr_renamed_102 = new ArrayList<sprrof>();
        iterator = arg0.cfr_renamed_102.iterator();
        Iterator<Serializable> iterator3 = iterator;
        while (iterator3.hasNext()) {
            this.cfr_renamed_102.add(((sprrof)iterator.next()).cfr_renamed_1316());
            iterator3 = iterator;
        }
        sprqsf sprqsf5 = this;
        sprqsf sprqsf6 = this;
        sprqsf6.cfr_renamed_93 = new TreeMap<Integer, sprknf>(arg0.cfr_renamed_93);
        sprqsf6.cfr_renamed_2 = arg0.cfr_renamed_2;
        sprqsf5.cfr_renamed_91 = arg1;
        sprqsf5.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_5902();
    }

    public List<sprknf> cfr_renamed_5772() {
        Iterator<sprknf> iterator;
        ArrayList<sprknf> arrayList = new ArrayList<sprknf>();
        Iterator<sprknf> iterator2 = iterator = this.cfr_renamed_132.iterator();
        while (iterator2.hasNext()) {
            sprknf sprknf2 = iterator.next();
            iterator2 = iterator;
            arrayList.add(sprknf2);
        }
        return arrayList;
    }
}

