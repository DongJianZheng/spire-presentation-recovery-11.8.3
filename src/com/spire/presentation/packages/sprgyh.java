/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import com.spire.presentation.packages.sprho;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprvg;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class sprgyh
implements sprvg {
    private final OutputStream cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_9006(long arg0) throws IOException {
        sprgyh sprgyh2 = this;
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 24));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 16));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 8));
        sprgyh2.cfr_renamed_4.write((int)arg0);
    }

    private /* synthetic */ void cfr_renamed_9007(int arg0) throws IOException {
        sprgyh sprgyh2 = this;
        sprgyh2.cfr_renamed_4.write(arg0 >> 16);
        sprgyh2.cfr_renamed_4.write(arg0 >> 8);
        sprgyh2.cfr_renamed_4.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_9008(long arg0) throws IOException {
        sprgyh sprgyh2 = this;
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 56));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 48));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 40));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 32));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 24));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 16));
        sprgyh2.cfr_renamed_4.write((int)(arg0 >> 8));
        sprgyh2.cfr_renamed_4.write((int)arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_9009(sprfo arg0) throws IOException {
        sprfo sprfo2 = arg0;
        sprgyh sprgyh2 = this;
        sprgyh2.cfr_renamed_9007(arg0.cfr_renamed_8159());
        sprgyh2.cfr_renamed_4.write(arg0.cfr_renamed_324());
        long l = sprfo2.cfr_renamed_806();
        this.cfr_renamed_9006(l);
        switch (sprfo2.cfr_renamed_324()) {
            case 4: {
                byte[] byArray = ((BigInteger)arg0.cfr_renamed_97()).toByteArray();
                int n = (int)(l - (long)byArray.length);
                if (n != 0) {
                    int n2;
                    byte by = (byte)(byArray[0] < 0 ? 255 : 0);
                    int n3 = n2 = 0;
                    while (n3 != n) {
                        this.cfr_renamed_4.write(by);
                        n3 = ++n2;
                    }
                }
                this.cfr_renamed_4.write(byArray);
                return;
            }
            case 6: {
                this.cfr_renamed_9008((Boolean)arg0.cfr_renamed_97() != false ? 1L : 0L);
                return;
            }
            case 8: {
                this.cfr_renamed_4.write((byte[])arg0.cfr_renamed_97());
                this.cfr_renamed_9010(l);
                return;
            }
            case 9: {
                this.cfr_renamed_9008(((Date)arg0.cfr_renamed_97()).getTime());
                return;
            }
            case 5: {
                this.cfr_renamed_9011((Integer)arg0.cfr_renamed_97());
                return;
            }
            case 2: {
                this.cfr_renamed_9011((Integer)arg0.cfr_renamed_97());
                return;
            }
            case 10: {
                this.cfr_renamed_9011(((Long)arg0.cfr_renamed_97()).intValue());
                return;
            }
            case 3: {
                this.cfr_renamed_9008((Long)arg0.cfr_renamed_97());
                return;
            }
            case 1: {
                Iterator iterator;
                Iterator iterator2 = iterator = ((List)arg0.cfr_renamed_97()).iterator();
                while (iterator2.hasNext()) {
                    this.cfr_renamed_9009((sprfo)iterator.next());
                    iterator2 = iterator;
                }
                return;
            }
            case 7: {
                this.cfr_renamed_4.write(sprkoe.cfr_renamed_431((String)arg0.cfr_renamed_97()));
                this.cfr_renamed_9010(l);
                return;
            }
        }
    }

    private /* synthetic */ void cfr_renamed_9010(long arg0) throws IOException {
        int n = 8 - (int)(arg0 % 8L);
        if (n != 8) {
            int n2;
            int n3 = n2 = 0;
            while (n3 != n) {
                this.cfr_renamed_4.write(0);
                n3 = ++n2;
            }
        }
    }

    public sprgyh(OutputStream outputStream) {
        this.cfr_renamed_4 = outputStream;
    }

    @Override
    public void cfr_renamed_9005(sprho arg0) throws IOException {
        this.cfr_renamed_9009(arg0.cfr_renamed_9004());
    }

    private /* synthetic */ void cfr_renamed_9011(int arg0) throws IOException {
        sprgyh sprgyh2 = this;
        sprgyh2.cfr_renamed_4.write(arg0 >> 24);
        sprgyh2.cfr_renamed_4.write(arg0 >> 16);
        sprgyh2.cfr_renamed_4.write(arg0 >> 8);
        sprgyh2.cfr_renamed_4.write(arg0);
        sprgyh2.cfr_renamed_4.write(0);
        sprgyh2.cfr_renamed_4.write(0);
        sprgyh2.cfr_renamed_4.write(0);
        sprgyh2.cfr_renamed_4.write(0);
    }
}

