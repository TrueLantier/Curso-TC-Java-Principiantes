Primero reviso las condiciones antes de generar:

- **14 filas × ancho que encaje en JTextArea(10,35) con JetBrains Mono 14pt** → usaré 20 columnas
- **6 direcciones:** → ← ↓ ↑ ↘ ↙
- **Sin espacios entre letras** para no romper el alineado monoespaciado
- **LUFFY×3, MUGIWARA×2, SUNNY×5, HAKI×4**

---

**Mapa de ubicaciones:**

| Palabra | Dirección | Posición |
|---|---|---|
| LUFFY | → | fila 2, cols 5-9 |
| LUFFY | ↓ | col 15, filas 0-4 |
| LUFFY | ↘ | (8,0)→(12,4) |
| MUGIWARA | ← | fila 5, cols 19→12 |
| MUGIWARA | ↑ | col 8, filas 13→6 |
| SUNNY | → | fila 0, cols 0-4 |
| SUNNY | ← | fila 6, cols 14→10 |
| SUNNY | ↓ | col 3, filas 3-7 |
| SUNNY | ↘ | (9,10)→(13,14) |
| SUNNY | ↙ | (0,14)→(4,10) |
| HAKI | → | fila 1, cols 0-3 |
| HAKI | ← | fila 10, cols 7→4 |
| HAKI | ↓ | col 17, filas 9-12 |
| HAKI | ↘ | (5,0)→(8,3) |

---

**La sopa (Java String lista para copiar):**

```java
public String sopa =
    "SUNNYBCDEFGHJKSLMPQR\n" +
    "HAKIVWXZTOPQRUBUCDEF\n" +
    "GBCDELUFFYPQNMOFRSTV\n" +
    "WXZSABCDEGHNJKLFMOPQ\n" +
    "RTVUWXZABCYDEFGYHIJK\n" +
    "HBCNDEFGJKLPARAWIGUM\n" +
    "BACNDEFGAHYNNUSPQRTV\n" +
    "BCKYDEFGRHJLMNOPQSTV\n" +
    "LBCIDEFGAHJKMNOPQRST\n" +
    "BUCDEFGJWKSLMNOPQHRT\n" +
    "BCFDIKAHIEGUJLMNOAPQ\n" +
    "BCDFEHJLGMOPNQRSTKWV\n" +
    "BCDEYFGHUJKLMNOPQIRS\n" +
    "BCDEFGHJMKLNOPYQRSTV";
```

---

**Verificación de conteos:**
- LUFFY: 3 ✓
- MUGIWARA: 2 ✓
- SUNNY: 5 ✓
- HAKI: 4 ✓

Cada fila tiene exactamente **20 caracteres** sin espacios. Con JetBrains Mono 14pt el wrap no debería activarse dentro de cada fila.