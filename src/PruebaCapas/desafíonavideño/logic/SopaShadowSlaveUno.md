Primero el mapa de ubicaciones:

| Palabra | Dirección | Posición |
|---|---|---|
| DREAM | → | fila 0, cols 0-4 |
| DREAM | ↓ | col 10, filas 3-7 |
| DREAM | ↘ | (7,5)→(11,9) |
| SPELL | → | fila 2, cols 0-4 |
| SPELL | ← | fila 4, cols 9→5 |
| SPELL | ↓ | col 15, filas 0-4 |
| SPELL | ↘ | (9,0)→(13,4) |
| NEPHIS | → | fila 6, cols 0-5 |
| NEPHIS | ← | fila 9, cols 14→9 |
| NEPHIS | ↘ | (1,10)→(6,15) |
| NEPHIS | ↓ | col 18, filas 1-6 |
| CREATURE | → | fila 11, cols 0-7 |
| CREATURE | ↓ | col 16, filas 0-7 |

---

```java
public String sopa2 =
    "DREAMBFGJKVWXYZSCQTO\n" +
    "BVWXYZKJGFNQTOBPRKNV\n" +
    "SPELLBVWXYZEQTOEEFEG\n" +
    "BVWXYZKJGFDQPTOLABPV\n" +
    "BVWXYLLEPSRQKHGLTFHB\n" +
    "BVWXYZKJGFEQTOIBUVIK\n" +
    "NEPHISBVWXAYZKJSRGSF\n" +
    "BVWXYDZKJGMFQTOBEVWX\n" +
    "BVWXYZRKJGFQTOBVWXYZ\n" +
    "SBVWXYZEKNEPHISBVWXY\n" +
    "BPVWXYZKAJGFQTOBVWXY\n" +
    "CREATUREBMVWXYZKJGFQ\n" +
    "BVWLXYZKJGFQTOBVWXYZ\n" +
    "BVWXLYZKJGFQTOBVWXYZ";
```

**Conteos:** DREAM×3 ✓ SPELL×4 ✓ NEPHIS×4 ✓ CREATURE×2 ✓  
Cada fila tiene exactamente **20 caracteres**.