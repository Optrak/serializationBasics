package com.optrak.experiment

import java.io.{FileInputStream, FileOutputStream}

import com.esotericsoftware.kryo.Kryo
import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer
import org.joda.time.DateTime
import com.esotericsoftware.kryo.io.{Input, Output}

/**
 * Created by oscarvarto on 2014/08/01.
 */
object HelloSerialization extends App {

  val kryo = new Kryo()
  val output = new Output(new FileOutputStream("file.bin"));
  val d = new DateTime()
  kryo.register( classOf[DateTime], new JodaDateTimeSerializer() )
  kryo.writeObject(output, d);
  output.close();

  val input = new Input(new FileInputStream("file.bin"));
  val d2 = kryo.readObject(input, classOf[DateTime])
  assert(d == d2)
  input.close();
}
