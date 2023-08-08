ages = [28, 50, 'ひみつ', 20, 78, 25, 22, 10, '無回答', 33]

samples = []
for data in ages:
	if not isinstance(data, int):
		continue
	if data < 20 or data >= 30:
		continue
	samples.append(data)
print(samples)

"""
instance関数
instance(データ、データ型)
データがデータ型と一致したらTrueに置き換わる
データ型にはint,str,boolなどが使用できる

java
if(!(data instanceof Integer)){
}
"""
