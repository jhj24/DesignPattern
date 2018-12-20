# 设计模式

### 1. 单例模式

- 双重检查

### 2. Builder模式


### 3. library模式（）

有点像单例模式与Builder的结合，这种模式可以用于自定义module中使用，有些属性样式在Application中初始化后，可以在App中直接调用，这样的话就不用在每次调用module中方法的时候都要设置某个属性。

中间有个　`SlimInit`　类，这个类可以做逻辑处理，用这个类的主要原因是这初始化有　`Context` 时，会出现以下警告：

```
Do not place Android context classes in static fields...
```

中间有个　`SlimInit`　类在中间过度的话，在　`Util`　调用　`SlimInit`　的方法即可，看着比较简单。
