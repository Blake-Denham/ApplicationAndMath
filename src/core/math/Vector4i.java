package core.math;

public class Vector4i {
	public int x, y, z, w;

	public Vector4i(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public Vector4i() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}

	public int dot(Vector4i vec) {
		return x * vec.x + y * vec.y + z * vec.z + w * vec.w;
	}


	public Vector4i add(Vector4i vec) {
		return new Vector4i(x + vec.x, y + vec.y, z + vec.z, w * vec.w);
	}

	public void addTo(Vector4i vec) {
		x += vec.x;
		y += vec.y;
		y += vec.z;
		w += vec.w;
	}

	public Vector4i sub(Vector4i vec) {
		return new Vector4i(x - vec.x, y - vec.y, z - vec.z, w - vec.w);
	}

	public void subFrom(Vector4i vec) {
		x -= vec.x;
		y -= vec.y;
		z -= vec.z;
		w -= vec.w;
	}

	public Vector4i mul(int scalar) {
		return new Vector4i(scalar * x, scalar * y, scalar * z, scalar * w);
	}


	public void mulTo(int scalar) {
		x *= scalar;
		y *= scalar;
		z *= scalar;
		w *= scalar;
	}


	public Vector4i normalise() {
		float len = len();
		x /= len;
		y /= len;
		z /= len;
		w /= len;
		return this;
	}

	public float len() {
		return (float) Math.sqrt(dot(this));
	}

	public int len2() {
		return dot(this);
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + ", " + z + ", " + w + "]";
	}

	public Vector4i cpy() {
		return new Vector4i(x, y, z, w);
	}

	public Vector4i scl(Vector4i vec) {
		return new Vector4i(x * vec.x, y * vec.y, z * vec.z, w * vec.w);
	}

	public void set(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public void set(Vector4i vec) {
		set(vec.x, vec.y, vec.z, vec.w);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vector4i) {
			Vector4i temp = (Vector4i) obj;
			return temp.x == x && temp.y == y && temp.z == z && temp.w == w;
		} else {
			return false;
		}
	}
}
