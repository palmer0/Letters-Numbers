package es.ulpgc.eite.da.letters_numbers.data;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class LetterData implements BaseData {


  public Long id;
  public String letter;
  public List<NumberData> numbers;

  public LetterData() {
    id = generateUniqueId();
    letter = "";
    numbers= new ArrayList<>();
  }

  @Override
  public String getValue() {
    return letter;
  }


  /**
   * Genereate unique ID from UUID in positive space
   * Reference: http://www.gregbugaj.com/?p=587
   *
   * @return long value representing UUID
   */
  private Long generateUniqueId() {
    long val = -1;

    do {

      final UUID uid = UUID.randomUUID();
      final ByteBuffer buffer = ByteBuffer.wrap(new byte[16]);
      buffer.putLong(uid.getLeastSignificantBits());
      buffer.putLong(uid.getMostSignificantBits());
      final BigInteger bi = new BigInteger(buffer.array());
      val = bi.longValue();
    }

    // We also make sure that the ID is in positive space,
    // if its not we simply repeat the process
    while (val < 0);
    return val;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LetterData)) return false;
    LetterData data = (LetterData) obj;
    return Objects.equals(id, data.id);
  }

  @Override
  public String toString() {
    return letter;
  }
}
